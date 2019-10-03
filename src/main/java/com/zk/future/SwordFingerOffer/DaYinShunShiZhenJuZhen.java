package com.zk.future.SwordFingerOffer;

import java.util.ArrayList;

/**
 * @Author: zking
 * @Date: 2019/9/6 21:42
 * @Content:
 */
public class DaYinShunShiZhenJuZhen {

    public static void main(String[] args) {
        int[][] matrix11 = {{1, 2, 3, 4,}, {5, 6, 7, 8,}, {9, 10, 11, 12,}, {13, 14, 15, 16}};
        int[][] matrix1 = {{1, 2, 3, 4,}, {5, 6, 7, 8,}};
        ArrayList<Integer> integers = printMatrix(matrix11);
        System.out.println(integers);
    }

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (matrix.length == 0) {
            return arrayList;
        }
        int m = matrix[0].length;
        int n = matrix.length;
        int layers = (Math.min(m, n) - 1) / 2 + 1;
        for (int i = 0; i < layers; i++) {
            for (int k = i; k < m - i; k++) arrayList.add(matrix[i][k]); // 左到右
            for (int j = i + 1; j < n - i; j++) arrayList.add(matrix[j][m - i - 1]);// 右上到右下
            for (int k = m - 2 - i; k >= i && m - i - i != i; k--) arrayList.add(matrix[m - i - 1][k]);//右下左下
            for (int j = n - 2 - i; j > i && n - i - 1 != i; j--) arrayList.add(matrix[j][i]);// 左下到左上
        }
        return arrayList;
    }


    public static ArrayList<Integer> printMatrix1(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = matrix.length;
        if (n == 0) return res;
        int m = matrix[0].length;
        int layers = (Math.min(n, m) - 1) / 2 + 1;
        for (int i = 0; i < layers; i++) {
            for (int k = i; k < m - i; k++) res.add(matrix[i][k]);
            for (int j = i + 1; j < n - i; j++) res.add(matrix[j][m - i - 1]);
            for (int k = m - i - 2; k >= i && m - i - 1 != i; k--) res.add(matrix[m - 1 - i][k]);
            for (int j = n - 2 - 1; j > i && n - i - 1 != i; j--) res.add(matrix[j][i]);
        }
        return res;
    }


}
