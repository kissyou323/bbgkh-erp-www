package com.lixiang.NormalUtils;


import java.util.Scanner;

/**
 * Created by lixiang on 2016/8/5.
 */
public class TongOrder {

    private static TongOrder gettongOrder = new TongOrder();

    private TongOrder(){

    }

    public static TongOrder getTong(){
        return gettongOrder;
    }

    public void getAseOrder(){
        getInput();
    }

    public void getList(int[] list){
        for (int i = 0; i < list.length ; i++) {
           while (list[i]-->0){
               System.out.print(i);
           }
        }
    }


    public void getInput(){
        int[] nums = new int[100];
        System.out.print("排序的个数：");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while (count-->0){
            nums[sc.nextInt()]++;
        }
        getList(nums);

    }
}
