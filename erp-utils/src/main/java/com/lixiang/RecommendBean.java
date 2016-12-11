//package com.lixiang;
//
//import java.io.File;
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**根据传入的Json串，来推荐相应的Bean实体类型
// * Created by lixiang on 11/19/2016.
// */
//public class RecommendBean {
//
//    private  String benlaiPath;
//
//    private  String beansPath;
//    //用来存放所有的Bean文件
//    private  List<String> beanFiles = new ArrayList<>();
//    //用来存放所有的Bean文件中的信息，key 是文件名， value 是文件中的变量信息
//    public  Map<String,List<String>> fieldsMap = new HashMap<>();
//
//
//
//
//    public  void doInit(){
//        getFilePath();
//        getFields();
//    }
//
//
//
//    public  void getFilePath(){
//        String targetPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
//        int targetIndex =targetPath.indexOf("target");
//        benlaiPath = targetPath.substring(0,targetIndex);
//        beansPath=benlaiPath+"src\\main\\java\\com\\benlai\\wap\\bean";
//
//        getFiles(new File(beansPath));
//
//
//
//    }
//
//    public  void getFiles(File file){
//        //如果是目录的话，则进行递归
//        if(file.isDirectory()){
//            for (File childFile : file.listFiles()) {
//                getFiles(childFile);
//            }
//        }else{
//            //如果不是目录的话，记录下来
//            String filePath = file.getPath();
//            int index = filePath.indexOf("com\\benlai\\wap\\bean");
//            String beanName = filePath.substring(index).replace("\\",".").replace(".java","");
//            beanFiles.add(beanName);
//        }
//    }
//
//    //用反射去加载实体类,并且把里面的field信息保存到Map里面去
//    public  void getFields(){
//        for (String beanFile : beanFiles) {
//            try {
//                Class clazz = Class.forName(beanFile);
//                List<String> fieldList = new ArrayList<>();
//                for (Field field : clazz.getDeclaredFields()) {
//                    fieldList.add(field.getName().toUpperCase());
//                }
//                fieldsMap.put(clazz.getSimpleName(),fieldList);
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    /**
//     * 获得推荐的实体类列表
//     * @param entities
//     * @return
//     */
//    public  List<String> getRecommed(List<String> entities){
//
//        int total = entities.size();
//
//
//        List<String> recommeds = new ArrayList<>();
//
//        for (Map.Entry<String, List<String>> entry : fieldsMap.entrySet()) {
//            //实体类的变量列表
//            int count =0;
//            List fieldList = entry.getValue();
//            //对传入的变量逐一做校验
//            for (String entity : entities) {
//                //把entity转成大写
//                entity=entity.toUpperCase();
//                if(fieldList.contains(entity)){
//                    count++;
//                }else{
//                    continue;
//                }
//
//            }
//            float radix = (float)count/total;
//            if(radix>0.5){
//                recommeds.add(entry.getKey());
//            }
//
//        }
//        //返回推荐的实体类列表
//
//        return recommeds;
//    }
//
//}
