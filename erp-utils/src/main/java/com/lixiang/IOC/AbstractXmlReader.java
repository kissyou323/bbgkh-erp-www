package com.lixiang.IOC;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lixiang on 2016/8/6.
 */
public class AbstractXmlReader {

    public Map readXML(){
        Map<String,BeanDefinition> beans = new HashMap<>();
        SAXReader saxReader = new SAXReader();
        InputStream is= this.getClass().getResourceAsStream("/MyIOC.xml");
        try {
            Document document = saxReader.read(is);
            Element root = document.getRootElement();
            //所有的Bean元素
            List<Element> list= root.elements();
            for(Element child:list){

                BeanDefinition bd = new BeanDefinition();

                List<Attribute> attributes = child.attributes();
                for(Attribute attr :attributes){
                    //Bean的id和class
                    System.out.println(attr.getName()+" "+attr.getValue());
                    if (attr.getName().equals("id")){
                        bd.setId(attr.getValue());
                    }else {
                        bd.setClassName(attr.getValue());
                    }
                }
                List<Properties> propertiesList = new ArrayList<>();
                List<Element> sub = child.elements();

                for (Element subEle : sub) {
                    Properties properties = new Properties();
                    List<Attribute> subAttrs = subEle.attributes();
                    for (Attribute subattr : subAttrs) {
                        //Properties的name和value
                        System.out.println(subattr.getName()+" "+subattr.getValue());
                        if(subattr.getName().equals("name")){
                            properties.setName(subattr.getValue());
                        }else {
                            properties.setValue(subattr.getValue());
                        }

                    }
                    propertiesList.add(properties);
                }

                bd.setProperties(propertiesList);
                beans.put(bd.getId(),bd);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return  beans;
    }
}
