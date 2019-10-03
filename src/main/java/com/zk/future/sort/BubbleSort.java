package com.zk.future.sort;

/**
 * @Author: zking
 * @Date: 2019/9/3 17:07
 * @Content:
 */
public class BubbleSort {

    /**
     * 冒泡排序是一種交換排序
     */
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        int[] solution = s(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] solution(int[] arr) {
        int len = arr.length;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            flag = false;
            for (int j = 0; j < len - 1 - i; j++) {
                int temp = 0;
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
            System.out.format("第 %d 趟：\t", i);
            printAll(arr);
        }
        return arr;
    }

    private static int[] s(int[] arr) {
        int len = arr.length;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            flag = false;
            for (int j = 0; j < len - 1 - i; j++) {
                int temp = 0;
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            System.out.format("第 %d 趟：\t", i);
            printAll(arr);
        }
        return arr;
    }

    private static void printAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
