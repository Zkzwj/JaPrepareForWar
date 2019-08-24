package com.zk.interview.tigger;

import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/8/23 18:50
 * @Content:
 */
public class Three {

    public static void main(String[] args) {
        String st = "London bridge is falling down";
        System.out.println(fun1(st));
        System.out.println(fun2(st));


    }

    public static String fun1(String str) {
        //方法一 将字符串转换为字符数组
        char[] arr = str.toCharArray();
        //逆序输出字符数组
        for (int i = 0; i < arr.length / 2; i++) {
            char temp;
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return new String(arr);
    }

    public static String fun2(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

}
