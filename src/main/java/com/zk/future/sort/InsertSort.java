package com.zk.future.sort;

/**
 * @Author: zking
 * @Date: 2019/9/3 20:36
 * @Content:
 */
public class InsertSort {


    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 3};
        ss(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    private static void s(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j = 0;
            int temp = arr[i];
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    /**
     * 希尔排序----直插排序的升级版
     *
     * @param arr
     */
    private static void ss(int[] arr) {
        int gap = arr.length / 2;
        while (gap >= 1) {
            for (int i = gap; i < arr.length; i++) {
                int j = 0;
                int temp = arr[i];
                for (j = i - gap; j >= 0 && temp < arr[j]; j = j - gap) {
                    arr[j + gap] = arr[j];
                }
                arr[j + gap] = temp;
            }
            gap = gap / 2;
        }
    }

}
