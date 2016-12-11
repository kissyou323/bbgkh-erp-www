package com.bbgkh.model;

/**
 * Created by lixiang on 2016/7/16.
 */
public class Members {
    private int id;
    private String name;


    public Members() {
    }

    public Members(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
