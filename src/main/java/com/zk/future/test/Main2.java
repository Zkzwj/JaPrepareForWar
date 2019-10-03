package com.zk.future.test;

/**
 * @Author: zking
 * @Date: 2019/9/22 16:17
 * @Content:
 */
public class Main2 {

    public static void main(String[] args) {
        int[] num = {3, 7, 4, 11, 8, 10};
        int left = 0;
        int right = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                right += num[i];
            } else {
                left += num[i];
            }
        }
        int res = left - right;
        System.out.println(Math.abs(res));
    }
}
