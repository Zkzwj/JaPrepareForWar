package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/19 22:12
 * @Content:
 */
public class DaYinDuiJiaoJuZhen {


    public static void main(String[] args) {
        DaYinDuiJiaoJuZhen d = new DaYinDuiJiaoJuZhen();
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        d.print(a, 4);
    }

    public void print(int[][] arr, int n) {
        int row;
        int col;
        //输出右上角代码，包括对角线上的元素
        for (int i = n - 1; i >= 0; i--) {//每次都是从第0行开始，所以需要row = 0,然后row  col  同时自增
            row = 0;
            col = i;
            while (row >= 0 && col >= 0 && row < n && col < n) {
                System.out.print(arr[row][col] + " ");
                row++;
                col++;
            }
        }
        //for输出左下角代码，对角线上的元素已经打印完了，所以在这里从1开始
        for (int i = 1; i < n; i++) {//每次都是从第0列开始，所以需要col = 0,然后row  col  同时自增
            row = i;
            col = 0;
            while (row >= 0 && row < n && col >= 0 && col < n) {
                System.out.print(arr[row][col] + " ");
                row++;
                col++;
            }
        }
    }
}
