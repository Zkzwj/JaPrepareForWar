package com.zk.interview.qunar;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        // 定义数组的长度
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        int arr[][] = new int[n][];
        // 遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            // 确定二维数组元素的大小
            arr[i] = new int[i + 1];
            // 遍历一维数组
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || arr[i].length - 1 == j) {
                    // 三角形两腰全为 1
                    arr[i][j] = 1;
                } else {
                    // 其他元素等于两肩数字之和
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                if (i == n - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }


}
