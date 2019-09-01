package com.zk.interview.yuanfudao;

import java.util.ArrayList;

/**
 * @Author: zking
 * @Date: 2019/8/30 17:14
 * @Content: 二维数组回行打印
 */
public class huiXingPrintMatrix {

    public static void main(String[] args) {
        int[][] matrix11 = {{1, 2, 3, 4,}, {5, 6, 7, 8,}, {9, 10, 11, 12,}, {13, 14, 15, 16}};
        int[][] matrix1 = {{1, 2, 3, 4,}, {5, 6, 7, 8,}};
        ArrayList<Integer> integers = printMatrix(matrix1);
        System.out.println(integers);
        ArrayList<Integer> integers1 = printMatrix1(matrix1);
        System.out.println(integers);
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (matrix.length == 0) return result;
        int n = matrix.length;
        int m = matrix[0].length;
        if (m == 0) return result;
        int layers = (Math.min(n, m) - 1) / 2 + 1;//这个是层数
        for (int i = 0; i < layers; i++) {
            for (int k = i; k < m - i; k++) result.add(matrix[i][k]);//左至右
            for (int j = i + 1; j < n - i; j++) result.add(matrix[j][m - i - 1]);//右上至右下
            for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--) result.add(matrix[n - i - 1][k]);//右至左
            for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--) result.add(matrix[j][i]);//左下至左上
        }
        return result;
    }

    public static ArrayList<Integer> printMatrix1(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (matrix.length == 0) return result;
        int n = matrix.length, m = matrix[0].length;
        if (m == 0) return result;
        int layers = (Math.min(n, m) - 1) / 2 + 1;
        for (int i = 0; i < layers; i++) {
            for (int k = i; k < m - i; k++) result.add(matrix[i][k]);
            for (int j = i + 1; j < n - i; j++) result.add(matrix[j][m - i - 1]);
            for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--) result.add(matrix[n - i - 1][k]);
            for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--) result.add(matrix[j][i]);
        }
        return result;
    }


    public static ArrayList<Integer> t(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return res;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        if (m == 0) {
            return res;
        }
        int layers = (Math.min(n, m) - 1) / 2 + 1;
        for (int i = 0; i < layers; i++) {
            for (int k = 0; k < m - i; k++) res.add(matrix[i][k]);
            for (int j = i + 1; j < n - i; j++) res.add(matrix[j][m - 1 - i]);
            for (int k = m - 2 - i; k >= i && n - i - 1 != i; k--) res.add(matrix[n - 1 - i][k]);
            for (int j = n - 2 - i; j > i && m - i - 1 != i; j--) res.add(matrix[j][i]);

        }
        return res;
    }
}
