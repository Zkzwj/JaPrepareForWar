package com.zk.interview.weizhongBank;

import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/19 14:51
 * @Content:
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
            if (sum > 1000003) {
                sum = sum % 1000003;
            }
        }
        System.out.println(sum);
    }
}
