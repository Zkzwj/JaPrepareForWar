package com.zk.future.accumulation;

/**
 * @Author: zking
 * @Date: 2019/9/12 13:19
 * @Content:
 */
public class JuZhenDuiJiaoDaYin {

    public static void main(String[] args) {
        JuZhenDuiJiaoDaYin main = new JuZhenDuiJiaoDaYin();
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        main.print1(a, 4);
        System.out.println();
        jiuJiuChengFaKouJue();
    }

    private void print(int a[][], int n) {
        int row;
        int col;
        //输出右上角代码，包括对角线上的元素
        for (int i = n - 1; i >= 0; i--) {//每次都是从第0行开始，所以需要row = 0,然后row  col  同时自增
            row = 0;
            col = i;
            while (row >= 0 && row < n && col >= 0 && col < n) {
                System.out.print(a[row][col] + " ");
                row++;
                col++;
            }
        }

        //for输出左下角代码，对角线上的元素已经打印完了，所以在这里从1开始
        for (int i = 1; i <= n - 1; i++) {//每次都是从第0列开始，所以需要col = 0,然后row  col  同时自增
            row = i;
            col = 0;
            while (row >= 0 && row < n && col >= 0 && col < n) {
                System.out.print(a[row][col] + " ");
                row++;
                col++;
            }
        }
    }//print


    private static void print1(int[][] arr, int n) {
        int row = 0;
        int col = 0;
        for (int i = n - 1; i >= 0; i--) {
            row = 0;
            col = i;
            while (row >= 0 && row < n && col >= 0 && col < n) {
                System.out.print(arr[row][col] + " ");
                row++;
                col++;
            }
        }

        for (int i = 1; i < n - 1; i++) {
            row = i;
            col = 0;
            while (row >= 0 && row < n && col >= 0 && col < n) {
                System.out.print(arr[row][col] + " ");
                row++;
                col++;
            }
        }
    }


    private static void jiuJiuChengFaKouJue() {
        System.out.println("乘法口诀：");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 && j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
