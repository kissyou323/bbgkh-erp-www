package com.bbgkh.utils;

import com.bbgkh.model.DTO.ProductInfoDTO;

import java.lang.reflect.Field;

/**
 * Created by lixiang on 12/19/2016.
 */
public class SKUUtils {

    public static String generateSKU(ProductInfoDTO productInfo){
        StringBuffer sku = new StringBuffer();
        sku.append(productInfo.getSexId());
        sku.append(productInfo.getColorInfoId());
        sku.append(productInfo.getSizeInfoId());
        sku.append(productInfo.getProductSysNo());

        return sku.toString();

    }

    public static void main(String[] args) {
        String color = "红色";
        for (char c : color.toCharArray()) {
            byte b = (byte)c;
            System.out.println(b);
        }
    }
}
