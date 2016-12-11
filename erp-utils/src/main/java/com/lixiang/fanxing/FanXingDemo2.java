package com.lixiang.fanxing;
import java.util.ArrayList;
import java.util.Collection;


class Animal {}

class Dog extends Animal {}

class Cat{}

public class FanXingDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Collection < ? super Dog> collection = new ArrayList <Animal>();
        Dog dog = new Dog();
        Animal animal  = new Animal();
    //    collection.add(animal);
    }

}
