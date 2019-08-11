package com.zk.future.leetcode;

/**
 * @Author: zking
 * @Date: 2019/8/4 13:59
 * @Content:不同路径
 */
public class UniquePaths {

    public static void main(String[] args) {
        int res = uniquePaths(3, 2);
        System.out.println("排列组合："+res);
        int res1 = uniquePaths1(3, 2);
        System.out.println(res1);


    }

    /**
     * 一个机器人位于一个m*n网格的左上角，机器人每次只能向下或者向右走一步，机器人试图走到网格的右下角
     * 问：有多少种不同的路径
     * @param m
     * @param n
     * 排列组合
     */
    public static int uniquePaths(int m, int n){
        return fib(m+n-2) / fib(n - 1 ) / fib(m - 1);
    }

    /**
     * 斐波那契
     * @param num
     * @return
     */
    private static int fib(int num){
        if (num == 1 || num == 2){
            return 1;
        }else {
            return fib(num - 2)+ fib(num - 1);
        }
    }

    /**
     * 动归
     * @param m
     * @param n
     * @return
     */
    private static int uniquePaths1(int m, int n){
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

}
