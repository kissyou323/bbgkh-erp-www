package com.bbgkh.utils;

import com.bbgkh.model.DTO.ProductInfoDTO;

/**
 * Created by lixiang on 12/19/2016.
 */
public class SKUUtils {

    public static void generateSKU(ProductInfoDTO productInfo){


    }

    public static void main(String[] args) {
        String color = "红色";
        for (char c : color.toCharArray()) {
            byte b = (byte)c;
            System.out.println(b);
        }
    }
}
