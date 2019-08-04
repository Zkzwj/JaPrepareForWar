package com.zk.future.leetcode;

/**
 * @Author: zking
 * @Date: 2019/8/4 14:17
 * @Content: 斐波那契
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public static int fib(int num){
        if (num == 1 || num == 2){
            return 1;
        }else {
            return fib(num - 2) + fib(num - 1);
        }

    }

}
