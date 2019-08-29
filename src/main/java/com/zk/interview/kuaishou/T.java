package com.zk.interview.kuaishou;

import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/8/25 18:35
 * @Content:
 */
public class T {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String ss1 = sc.nextLine();
            String ss2 = sc.nextLine();
            String[] s1 = ss1.split(" ");
            String[] s2 = ss2.split(" ");
            int i = 0, j = 0;
            boolean f = true;
            for (; s1.length - i >= 4 && j <= s2.length - 1; ) {
                System.out.print(s1[i] + " " + s1[i + 1] + " " + s1[i + 2] + " " + s1[i + 3]);
                if (f) f = false;
                System.out.print(" " + s2[j]);
                i += 4;
                j++;
                if (s1.length - i >= 4 && j <= s2.length - 1) System.out.print(" ");
            }
            while (i < s1.length) {
                if (f) {
                    f = false;
                    System.out.print(s1[i]);
                } else System.out.print(" " + s1[i]);
                i++;
            }
            while (j < s2.length) {
                if (f) {
                    f = false;
                    System.out.print(s2[j]);
                } else System.out.print(" " + s2[j]);
                j++;
            }
        }
    }
}
