//package com.lixiang;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.benlai.base.common.Init;
//import com.squareup.javapoet.FieldSpec;
//import com.squareup.javapoet.JavaFile;
//import com.squareup.javapoet.TypeSpec;
//import org.apache.commons.io.FileUtils;
//
//import javax.lang.model.element.Modifier;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//
///**从Json生成Bean文件，现支持变量类型为String，List。
// * Created by lixiang on 11/18/2016.
// */
//public class jsonToBean {
//
//    //用于存放类型和实体类的Map,key是名字，value是类型
//    private static Map<String,String> beanMap = new HashMap<>();
//
//    private static Map<String,List<String>> jsonMap = new HashMap<>();
//
//    //用来保存类型是List的变量
//    private static List<String> jsonLists = new ArrayList<>();
//
//    private static Map<String , List<String>> generateMap = new ConcurrentHashMap<>();
//
//    //本地Json文件存放路径
//    private static String jsonPath;
//
//    private static String jsonStr;
//
//    private static String beanName;
//
//    static{
//        doInit();
//    }
//
//    public static void main(String[] args) {
//
//        genrate(jsonStr);
//        filterMap();
//        //生成Bean实体文件，只生成推荐，不生成文件时可注解掉
//        //    generateBeanByJavaPoet();
//
//    }
//
//    public static void filterMap(){
//
//        generateMap.putAll(jsonMap);
//
//        RecommendBean recommendBean= new RecommendBean();
//        recommendBean.doInit();
//
//        for (Map.Entry<String, List<String>> entry : generateMap.entrySet()) {
//            List<String> recommed = recommendBean.getRecommed(entry.getValue());
//            System.out.println(entry.getKey()+"=============>"+recommed);
//            if(recommed.size()>0){
//                //有推荐的实体类信息，则将其从map中移除
//                generateMap.remove(entry.getKey());
//            }
//        }
//    }
//
//    private static void genrate(String jsonStr){
//
//        try{
//            //第一层是Object
//            JSONObject rootObj = JSON.parseObject(jsonStr).getJSONObject("data");
//            List<String> fieldList = new ArrayList<>();
//            for (Map.Entry<String, Object> objectEntry : rootObj.entrySet()) {
//                fieldList.add(objectEntry.getKey());
//            }
//            jsonMap.put(beanName,fieldList);
//            String rootStr = JSON.toJSONString(rootObj);
//
//            generateBean(rootStr);
//        }catch (Exception e){
//            //第一层是Array
//            JSONArray jsonArray = JSON.parseObject(jsonStr).getJSONArray("data");
//            String arrayString = jsonArray.get(0).toString();
//            generateBeanFormArray(arrayString,beanName);
//        }
//
//    }
//
//    /**
//     * 现在是String，后期会改成File传值
//     * @param jsonStr
//     */
//    private static void generateBean(String jsonStr){
//
//        //先把传进来的String转成jsonObject,或者jsonArray
//
//        JSONObject rootObject = JSON.parseObject(jsonStr);
//        //对rootObject中的每个值进行遍历
//
//        for (Map.Entry<String, Object> entry : rootObject.entrySet()) {
//
//            if(entry.getValue().toString().startsWith("[")){
//                //如果是List的话
//                JSONArray jsonArray = rootObject.getJSONArray(entry.getKey());
//                String arrayString = jsonArray.get(0).toString();
//                generateBeanFormArray(arrayString,entry.getKey());
//            }else{
//                //如果是Object
//                List<String> fieldList = new ArrayList<>();
//                try {
//                    JSONObject secObj = rootObject.getJSONObject(entry.getKey());
//                    for (Map.Entry<String, Object> objectEntry : secObj.entrySet()) {
//                        fieldList.add(objectEntry.getKey());
//                    }
//                    jsonMap.put(entry.getKey(),fieldList);
//                }catch (ClassCastException e){
//
//                }
//            }
//
//        }
//    }
//
//    private static void generateBeanFormArray(String rootString,String target){
//
//        try {
//            JSONObject rootObject = JSON.parseObject(rootString);
//            List<String> fieldList = new ArrayList<>();
//            for (Map.Entry<String, Object> objectEntry : rootObject.entrySet()) {
//                fieldList.add(objectEntry.getKey());
//            }
//            jsonMap.put(target, fieldList);
//            //同时对List单独做个记录
//            jsonLists.add(target);
//            generateBean(rootString);
//        }catch (Exception e){
//
//        }
//    }
//
//    //做一些路径初始化的操作
//    private static void doInit(){
//        new Init();
//        beanName = Init.configMap.get("newInter_returnType");
//
//        String targetPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//        int targetIndex =targetPath.indexOf("target");
//        String benlaiPath = targetPath.substring(0,targetIndex);
//        jsonPath=benlaiPath+"src\\main\\resources\\jsonValues\\jsonValue.json";
//        try {
//            jsonStr = FileUtils.readFileToString(new File(jsonPath));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 使用JavaPoet生面java实体类文件
//     */
//    public  static void generateBeanByJavaPoet(){
//
//        //方法
//        /*MethodSpec mainMethod = MethodSpec.methodBuilder("testMain")
//                .addModifiers(Modifier.PUBLIC)
//                .addParameter(String[].class,"args")
//                .addStatement("$T.out.println($S)",System.class,"Hello World")
//                .build();*/
//
//        //先对jsonMap中的各个实体类做生成
//
//        for (Map.Entry<String, List<String>> mapEntry : generateMap.entrySet()) {
//            //生成变量
//            List<FieldSpec> fieldSpecs = new ArrayList<>();
//
//            for (String field : mapEntry.getValue()) {
//                Class clazz=String.class;
//                if(jsonLists.contains(field)){
//                    clazz = List.class;
//                }
//                FieldSpec fieldSpec = FieldSpec.builder(clazz,field)
//                        .addModifiers(Modifier.PRIVATE)
//                        .build();
//                fieldSpecs.add(fieldSpec);
//            }
//
//            //类名
//            TypeSpec typeSpec = TypeSpec.classBuilder(mapEntry.getKey())
//                    .addModifiers(Modifier.PUBLIC)
//                    .addFields(fieldSpecs)
//                    .build();
//
//            //包名，路径
//            JavaFile javaFile = JavaFile.builder("com.benlai.wap.bean.HotSearch",typeSpec)
//                    .build();
//
//
//            try {
//                //生成文件
//                File file = new File("src/main/java");
//                javaFile.writeTo(file);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }
//
//}
//
//
