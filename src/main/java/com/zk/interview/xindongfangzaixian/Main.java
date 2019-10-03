package com.zk.interview.xindongfangzaixian;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zking
 * @Date: 2019/9/23 19:34
 * @Content:
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String soure = sc.next();
        String str = sc.next();
        char[] chars = str.toCharArray();
        char[] s = soure.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (chars[i] != s[i]) {
                if (chars[i] == '?') {
                    boolean w = getW(chars, s, i);
                    System.out.println(w);
                }
                if (chars[i] == '+') {
                    boolean w = getAdd(chars, s, i);
                    System.out.println(w);
                }
                if (chars[i] == '.') {
                    boolean w = getDote(chars, s, i);
                    System.out.println(w);
                }
                if (chars[i] == '*') {
                    boolean w = getStar(chars, s, i);
                    System.out.println(w);
                }
            } else {
                continue;
            }
        }
    }


    private static boolean getW(char[] chars, char[] s, int i) {
        char w = chars[i];
        char temp = s[i];
        for (; i < chars.length; i++) {
            // 循环之后每一个字符，匹配
        }
        return false;
    }

    // 和上个一个方法思路一致，本方法处理"+"问题
    private static boolean getAdd(char[] chars, char[] s, int i) {
        return false;
    }

    // 和getW（）方法思路一致，本方法处理“.” 问题
    private static boolean getDote(char[] chars, char[] s, int i) {
        return false;
    }

    // 和getW（）方法思路一致，本方法处理“*” 问题
    private static boolean getStar(char[] chars, char[] s, int i) {
        return false;
    }
}
