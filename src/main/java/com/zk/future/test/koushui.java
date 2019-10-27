package com.zk.future.test;

import java.util.Scanner;

public class koushui {

    public static void main(String[] args) {
        new koushui().test();
    }

    public void test() {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double res = 0f;
        if (t <= 3000) {
            System.out.println(0f);
            return;
        } else if (t > 3000 && t <= 5000) {
            res = ( double) ((t - 3000) * 0.05);
        } else if (t > 5000 && t <= 20000) {
            res = ( double) (2000 * 0.05 + (t - 5000) * 0.1);
        } else if (t > 20000) {
            res = ( double) (2000 * 0.05 + 15000 * 0.1 + (t - 20000) * .015);
        }
        System.out.println(res);
    }
}
