package com.zk.interview.qunar;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0){
            return;
        }
        for (long j = 1; j <= n + 1; j++) {
            System.out.print(fun(n + 1, j) + " ");
        }
    }

    public static int fun(long i, long j) {
        if (j == 1 || i == j) {
            return 1;
        } else {
            return fun(i - 1, j) + fun(i - 1, j - 1);
        }
    }
}
