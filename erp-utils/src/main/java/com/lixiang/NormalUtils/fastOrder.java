package com.lixiang.NormalUtils;

/**
 * Created by lixiang on 8/31/2016.
 */
public class fastOrder {

    public static void main(String[] args) {
        fast();
    }


    public  static void fast(){
        int length=10;
        int[] nums =new int[length];
        //默认哨兵为第一个数
        int sentry = 0;

        int stop =0;

        //随机生成10个100以内的数字
        for (int i = 0; i < length; i++) {
            nums[i]=(int)(Math.random()*100);
        }

        int i=0;
        int j =length-1;
        System.out.println("sentry is "+nums[sentry]);
        //开始左右循环
        while(true){

            //先从右边开始
            for ( ; j >= 0; j--) {
                if(i==j){
                    break;
                }

                //如果右边的数比哨兵小
                if(nums[j]<nums[sentry]){
                    stop=j;
                    break;
                }

            }

            //再从左边开始
            for (; i < length; i++) {
                if(i==j){
                    break;
                }

                if(nums[i]>nums[sentry]){
                    //如果左边的数比哨兵大,与上面的stop交换位置
                    int temp =nums[stop];
                    nums[stop] = nums[i];
                    nums[i]=temp;
                    break;
                }

            }
            //左右相遇，将哨兵和相遇位置交换
            if(i==j){
                int temp;
                temp=nums[sentry];
                nums[sentry]=nums[i];
                nums[i]=temp;
                break;
            }
        }

        for (int k = 0; k < length; k++) {
            System.out.println(nums[k]);
        }




    }

}
