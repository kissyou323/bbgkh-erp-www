package com.lixiang.javaEight.day2Stream;

import com.lixiang.cglib.BookFacadeCglib;
import com.lixiang.model.JavaEight.Artist;
import com.lixiang.model.JavaEight.ModelFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * Created by lixiang on 8/24/2016.
 */
public class studyStream {

    public static void main(String[] args) {
       studyFilter();
    }


    public static void studyFilter(){
        List<Artist> artists = ModelFactory.getAritists();
        long count = artists.stream().filter(artist -> testFilter(artist)).count();
        System.out.println(count);
    }


    public static Boolean testFilter(Artist artist){
        return true;
    }
}