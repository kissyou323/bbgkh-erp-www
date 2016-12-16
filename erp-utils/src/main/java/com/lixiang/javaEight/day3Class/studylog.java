package com.lixiang.javaEight.day3Class;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by lixiang on 8/25/2016.
 */
public class studylog {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(studylog.class.getName());
        logger.info("aaa");
        logger.error("java");
        logger.debug("debug");
    }
}
