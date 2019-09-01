package com.zk.future.sort;

/**
 * @Author: zking
 * @Date: 2019/9/1 19:47
 * @Content:
 */
public class KuaiSuPaiXu {

    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 0, 7, 4, 6, 1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int partition = partition(arr, startIndex, endIndex);
        sort(arr, startIndex, partition - 1);
        sort(arr, partition + 1, endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];// 取基准值
        int mark = startIndex;// mark 初始化为起始下标
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < pivot) {
                mark++;
                int p = arr[mark];
                arr[mark] = arr[i];
                arr[i] = p;
            }
        }
        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }
}
