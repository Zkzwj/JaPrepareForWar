package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/24 19:26
 * @Content:
 */
public class Power {


    public static void main(String[] args) {
        double power = power(0.12, 2);
        System.out.println(power);

    }

    /**
     * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
     * 保证base和exponent不同时为0
     * 难点在于所有情况都要考虑
     * @param base
     * @param exponent
     * @return
     */
    private static double power(double base, int exponent) {
        double result = 1;
        int len = Math.abs(exponent);
        for (int i = 1; i <= len; i++) {
            result *= base;
        }
        if (exponent < 0) {
            return 1/result;
        }
        if(exponent == 0){
            return 1;
        }
        return result;
    }
}
