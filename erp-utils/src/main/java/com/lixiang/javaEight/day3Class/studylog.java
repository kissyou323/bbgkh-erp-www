package com.lixiang.javaEight.day3Class;


import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

/**
 * Created by lixiang on 8/25/2016.
 */
public class studylog {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(studylog.class.getName());
        logger.info("aaa");
        logger.debug("debug");
    }
}
