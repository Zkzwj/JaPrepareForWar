package com.zk.future.test;

import java.util.Arrays;

/**
 * @Author: zking
 * @Date: 2019/9/17 19:14
 * @Content:
 */
public class HeapExam {

    /**
     * 小根堆初始化
     *
     * @param a
     * @param length
     */
    public void minHeap(int a[], int length) {
        for (int i = length >> 1; i >= 0; i--) {
            adjustMinHeap(a, length, i);
        }
    }

    /**
     * 排序 topn
     *
     * @param a
     * @param length
     */
    public void sort(int a[], int length) {
        for (int i = 0, last = length; i < length - 1; i++) {
            swap(a, 0, --last);
            minHeap(a, last);

        }
    }


    /**
     * 小根堆调整
     *
     * @param a
     * @param length
     * @param i
     */
    private void adjustMinHeap(int[] a, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIndex = i;
        if (left < length && a[left] < a[i]) {
            minIndex = left;
        }
        if (right < length && a[right] < a[minIndex]) {
            minIndex = right;
        }
        if (minIndex != i) {
            swap(a, i, minIndex);
            adjustMinHeap(a, length, minIndex);
        }

    }


    /**
     * 交换 数组值
     *
     * @param a
     * @param i
     * @param j
     */
    private void swap(int[] a, int i, int j) {
        a[i] = a[i] + a[j];
        a[j] = a[i] - a[j];
        a[i] = a[i] - a[j];
    }

    public static void main(String[] args) {
        int[] a = {12, 7, 18, 31, 13, 9};
        //int[] arry_int={13, 38, 27, 55, 76, 65, 49, 97};
        HeapExam exam = new HeapExam();
        exam.minHeap(a, a.length);
        System.out.println("小根堆：" + Arrays.toString(a));
        exam.sort(a, a.length);
        System.out.println("排序结果：" + Arrays.toString(a));


    }
}
