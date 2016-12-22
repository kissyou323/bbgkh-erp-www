package com.bbgkh.model.enums;

/**
 * Created by lixiang on 12/20/2016.
 */
public enum  SizeEnum {
    Size1("24", 1),
    Size2("25", 2),
    Size3("26", 3),
    Size4("27", 4);

    private String name;

    private int index;

    private SizeEnum(String name, int index){
        this.name=name;
        this.index=index;
    }
}
