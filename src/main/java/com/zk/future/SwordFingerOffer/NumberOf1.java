package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/24 19:13
 * @Content:
 */
public class NumberOf1 {

    public static void main(String[] args) {
        int n = 4;
        int i = numberOf1(n);
        System.out.println(i);
        int i1 = numberOf1_2(n);
        System.out.println(i1);
    }

    private static int numberOf1(int n){
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }

    private static int numberOf1_2(int n){
        String result = "";
        int count = 0;
        result = Integer.toBinaryString(n);
        char[] array = result.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '1') {
                count++;
            }
        }
        return count;
    }
}
