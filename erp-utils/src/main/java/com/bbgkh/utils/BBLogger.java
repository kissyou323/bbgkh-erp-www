package com.bbgkh.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lixiang on 12/16/2016.
 */
public class BBLogger {
    private Logger logger;
    private BBLogger(Class<?> clazz) {
        logger = LogManager.getLogger();
    }
    private BBLogger(String name) {
        logger = LogManager.getLogger(name);
    }

    private BBLogger() {
        logger = LogManager.getRootLogger();
    }

    public static BBLogger getLogger(Class<?> clazz) {
        return new BBLogger(clazz);
    }

    public static BBLogger getLogger(String name) {
        return new BBLogger(name);
    }

    public static BBLogger getRootLogger() {
        return new BBLogger();
    }

    public void debug(Object message) {
        logger.debug(message);
    }
    public void debug(Object message, Throwable t) {
        logger.debug(message ,t);
    }
    public void debug(String message) {
        logger.debug(getMsgFormat() + message);
    }
    public void debug(String message, Throwable t) {
        logger.debug(getMsgFormat() + message, t);
    }
    public void debug(String message, Object... params) {
        logger.debug(getMsgFormat() + message, params);
    }

    public void info(Object message){
        logger.info(message);
    }
    public void info(Object message, Throwable t){
        logger.info(message, t);
    }
    public void info(String message) {
        logger.info(getMsgFormat() + message);
    }
    public void info(String message, Throwable t) {
        logger.info(getMsgFormat() + message,t);
    }
    public void info(String message, Object... params) {
        logger.info(getMsgFormat() + message, params);
    }

    public void warn(Object message){
        logger.warn(message);
    }
    public void warn(Object message, Throwable t){
        logger.warn(message ,t);
    }
    public void warn(String message) {
        logger.warn(getMsgFormat() + message);
    }
    public void warn(String message, Throwable t) {
        logger.warn(getMsgFormat() + message, t);
    }
    public void warn(String message, Object... params) {
        logger.warn(getMsgFormat() + message, params);
    }

    public void error(Object message) {
        logger.error(message);
    }
    public void error(Object message, Throwable t) {
        logger.error(message, t);
    }
    public void error(String message) {
        logger.error(getMsgFormat() + message);
    }
    public void error(String message, Throwable t) {
        logger.error(getMsgFormat() + message, t);
    }
    public void error(String message, Object... params) {
        logger.error(getMsgFormat() + message, params);
    }

    private static String getMsgFormat(){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        if(ra != null){
            HttpServletRequest req = ((ServletRequestAttributes)ra).getRequest();
            StringBuffer msg = new StringBuffer();
            msg.append("SessionID=");
            msg.append(req.getSession().getId());
            msg.append(";");
            return msg.toString();
        }
        return null;
    }
}
