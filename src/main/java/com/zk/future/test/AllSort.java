package com.zk.future.test;

import java.util.Scanner;

public class AllSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int buf[] = new int[n];
        for (int i = 0; i < n; i++) {
            buf[i] = sc.nextInt();
        }
        perm(buf, 0, buf.length - 1);
    }

    public static void perm(int[] buf, int start, int end) {
// 只对数组中一个元素全排列时，只要就按该数组输出即可
        if (start == end) {
            printString(buf);
        } else { // 多个字母全排列
            for (int i = start; i <= end; i++) {
                swap(buf, start, i); // 交换数组第一个元素与后续的元素
                perm(buf, start + 1, end);// 后续元素递归全排列
                swap(buf, start, i);// 将交换后的数组还原
            }
        }
    }

    static void swap(int buf[], int idx1, int idx2) {
        int temp = buf[idx1];
        buf[idx1] = buf[idx2];
        buf[idx2] = temp;
    }

    static void printString(int list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}