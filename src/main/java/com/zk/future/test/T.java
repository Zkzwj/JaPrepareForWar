package com.zk.future.test;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class T {

    private static Test test = new Test();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        int n = in.nextInt();
        int[] value = new int[n];
        int[] dp = new int[money + 1];
        for (int i = 0; i < n; i++) {
            value[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = money; j >= value[i]; --j) {
                int tmp = dp[j - value[i]] + value[i];
                if (tmp > dp[j]) {
                    dp[j] = tmp;
                }
            }
        }

        int k = money;
        while (dp[k] - money < 0) {
            k--;
        }
        if (dp[money] / money >= 3) {
            System.out.println(-1);
        } else {
            System.out.println(dp[k]);
        }

    }
}
