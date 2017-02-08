package com.bbgkh.model;

/**
 * Created by lixiang on 07/01/2017.
 */
public class BaseInfo {

    private String error;

    private String message;

    private Object object;

    public BaseInfo(){

    }

    public BaseInfo(String error) {
        this.error = error;
    }

    public BaseInfo(String error, String message){

        this.error = error;

        this.message = message;

    }

    public BaseInfo(String error, String message, Object object) {
        this.error = error;
        this.message = message;
        this.object = object;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
