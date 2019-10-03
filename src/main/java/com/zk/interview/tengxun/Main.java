package com.zk.interview.tengxun;

import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/20 19:39
 * @Content:
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] len = new int[t];
        String[] number = new String[t];
        for (int i = 0; i < t; i++) {
            len[i] = sc.nextInt();
            number[i] = sc.next();
        }
        for (int i = 0; i < t; i++) {
            if (len[i] < 11) {
                System.out.println("NO");
                continue;
            } else if (len[i] == 11) {
                if (number[i].length() == 11){
                    String temp = number[i].substring(0, 1);
                    if (temp.equals("8")) {
                        System.out.println("YES");
                        continue;
                    }
                }else {
                    continue;
                }
            } else {
                if (number[i].length() > 11){
                    char[] chars = number[i].toCharArray();
                    for (int j = 0; j <= chars.length - 11; j++) {
                        if (chars[j] == '8') {
                            System.out.println("YES");
                            break;
                        }
                    }
                }else {
                    continue;
                }
            }
        }
    }
}
