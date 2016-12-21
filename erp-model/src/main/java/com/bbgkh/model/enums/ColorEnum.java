package com.bbgkh.model.enums;

/**
 * Created by lixiang on 12/19/2016.
 */
public enum  ColorEnum {

    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

    private String name;

    private int index;

    private ColorEnum(String name, int index){
        this.name=name;
        this.index=index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
