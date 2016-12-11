package com.lixiang.IOC;

import java.util.Map;

/**
 * Created by lixiang on 2016/8/6.
 */
public class testIOC {
    public static void main(String[] args) {
        Map<String,BeanDefinition> benas= new AbstractXmlReader().readXML();

    }
}
