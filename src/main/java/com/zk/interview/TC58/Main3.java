package com.zk.interview.TC58;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num[][] = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                num[i][j] = sc.nextInt();
            }
        }
        int key = MatrixMin(num);
        System.out.println(key);
    }

    private static int MatrixMin(int [][] num) {
        int row = num.length;
        int col = num[0].length;
        int [][] dp = new int [row][col];
        dp[0][0] = num[0][0];
        for(int i=1;i<row;i++) {
            dp[i][0] = dp[i-1][0] + num[i][0];
        }
        for(int j=1;j<col;j++) {
            dp[0][j] = dp[0][j-1] +num[0][j];
        }
        for(int i=1;i<row;i++) {
            for(int j=1;j<col;j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1])+num[i][j];
            }
        }
        return dp[row-1][col-1];
    }
}