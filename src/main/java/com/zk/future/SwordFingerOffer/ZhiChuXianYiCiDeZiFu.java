package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/16 15:27
 * @Content:
 */
public class ZhiChuXianYiCiDeZiFu {

    public static void main(String[] args) {

        String str = "werrsdfwerADDsfdafsgdgdgdfgdfgdgg";
        int all = getAll(str);
        System.out.println(all);


    }

    private static int getAll(String str){
        int[] arr = new int['z'+1];
        for (int i = 0; i < str.length(); i++){
            arr[str.charAt(i)]++;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[str.charAt(i)] == 1){
                System.out.println(str.charAt(i));
                return i;
            }
        }
        return 0;
    }

}
