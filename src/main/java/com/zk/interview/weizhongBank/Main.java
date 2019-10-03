package com.zk.interview.weizhongBank;

import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/19 14:51
 * @Content:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long res = get(n);
        if (res > 0) {
            System.out.println(res % 10);
        }
    }

    private static long get(int n) {
        if (n == 0) {
            return 1;
        }
        long x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
            while (x % 10 == 0) {
                x /= 10;
            }
            x %= 100000;
        }
        return x;
    }
}