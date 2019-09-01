package com.zk.interview.yuanfudao;

/**
 * @Author: zking
 * @Date: 2019/8/31 12:47
 * @Content:
 */
public class QuChong {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 10};
        int[] arr1 = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 10};
        int k = 2;
        arrDel(arr, k);
        System.out.println();
        arrDel11(arr1, k);
    }


    private static void arrDel(int[] arr, int k) {
        int len = arr.length;
        int count = 1;
        int res = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > k) {
                    int l = i - count + 1;
                    for (int j = l; j +count < len ; j++) {
                        arr[j] = arr[j + count];
                    }
                    i = i -count;
                    res = res + count;
                }
                count = 1;
            }
        }
        for (int i = 0; i < len - res; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void arrDel11(int[] arr, int k) {
        int len = arr.length;
        int count = 1;
        int res = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > k) {
                    for (int j = i - count + 1; j + count < len; j++) {
                        arr[j] = arr[j + count];
                    }
                    i = i - count;
                    res = res + count;
                }
                count = 1;
            }
        }
        for (int i = 0; i < arr.length - res; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
