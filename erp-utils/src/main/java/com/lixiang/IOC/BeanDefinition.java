package com.lixiang.IOC;

import java.util.List;

/**
 * Created by lixiang on 2016/8/6.
 */
public class BeanDefinition {
    private String id;
    private String className;
    private List<Properties> properties;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }
}
