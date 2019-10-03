package com.zk.future.test;

/**
 * @Author: zking
 * @Date: 2019/9/15 22:15
 * @Content:
 */

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(process(a, b));
        }
    }

    public static int process(int a, int b) {
        int min = Integer.MAX_VALUE;
        int num;
        if (a < b) {
            for (int i = a; i < b && i < a + 2019; i++) {
                for (int j = i + 1; j < b + 1 && j < i + 2020; j++) {
                    num = ((i % 2019)) * ((j % 2019)) % 2019;
                    min = min < num ? min : num;
                }
            }
        } else {
            return 0;
        }
        return min;
    }
}
