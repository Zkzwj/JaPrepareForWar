package com.zk.interview.didi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/19 20:01
 * @Content:
 */
public class kongHao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 数组长度
        int m = sc.nextInt();// 区间长度
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; (j < i + m) && (i + m < n); j++) {
                sum += arr[j];
            }
            min = Math.min(sum , min);
        }
        System.out.println(min);

        int[] nm = new int[2];
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++){
            nm[i] = Integer.parseInt(s1[i]);
        }
        String s2 = sc.nextLine();
        String[] s3 = s2.split(" ");
        int[] arr1 = new int[nm[0]];
        for (int i= 0; i < nm[0]; i++){
            arr1[i] = Integer.parseInt(s3[i]);
        }
        System.out.println();

    }
}
