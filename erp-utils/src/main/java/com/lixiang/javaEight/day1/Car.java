package com.lixiang.javaEight.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by lixiang on 8/23/2016.
 */
class CarModel {

    public static CarModel create(Supplier<CarModel> carModelSupplier){
        return carModelSupplier.get();
    }

    public CarModel(){
        System.out.println("this is from construct");
    }

    public void say(){
        System.out.println("this is from say");
    }

}

public class Car{
    public static void main(String[] args) {
        CarModel carModel = CarModel.create(CarModel::new);
        List<CarModel> carModels = Arrays.asList(carModel);
        carModels.forEach(CarModel::say);
    }
}