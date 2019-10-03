package com.zk.interview.ctrip;

/**
 * @Author: zking
 * @Date: 2019/9/4 19:33
 * @Content:
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;
        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }

    /*请完成下面这个函数，实现题目要求的功能 ((ur)oi)
   当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
   ******************************开始写代码******************************/
    static String resolve(String expr) {
        char[] chars = expr.toCharArray();
        int len = chars.length;
        Stack<String> stack = new Stack<String>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] == '(') {
                left++;
            }
            if (chars[i] == ')') {
                right++;
            }
            stack.push(chars[i] + "");
        }
        if (left != right) {
            return "";
        }
        Stack<String> s2 = new Stack<>();
        int leftCount = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            String peek = stack.peek();
            stack.pop();
            if (peek == ")") {
                leftCount++;
                s2.push(peek);
            }
            int size = s2.size();
            if (!peek.equals("(")) {
                if (size != 0 && peek.equals(")")) {
                    for (int si = 0; si < size; si++) {
                        String temp = s2.peek();
                        s2.pop();
                        sb.append(temp);
                    }
                } else {
                    if (!peek.equals(")") && s2.isEmpty()) {
                        sb.append(peek);
                    }
                }

            }
        }
        return sb.toString();
    }

    /******************************结束写代码******************************/


    static String resolve1(String expr) {
        Stack stacks = new Stack();
        String num = "";
        int flag = 0;
        char[] arr = expr.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stacks.push(arr[i]);
            } else if (arr[i] == '(' && arr[i] == ')') {
                num = num + String.valueOf(arr[i]);
            } else {
                char t = String.valueOf(stacks.pop()).toString().charAt(0);
                char t1 = arr[i];
                if (t == '(' && t1 == ')') {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
        }
        if (flag == 0 || stacks.size() > 0) {
            return "";
        } else {
            char[] chars = num.toCharArray();
            String res = "";
            for (int i = chars.length - 1; i >= 0; i++) {
                res += chars[i];
            }
            return res;
        }
    }
}
