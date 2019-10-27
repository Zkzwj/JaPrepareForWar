package com.zk.future.test;

import java.util.Scanner;

/**
 * 全排列
 * https://blog.csdn.net/Angelkeepmoving/article/details/52274668
 */
public class AllSort1 {
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
        if (start == end) {
            printString(buf);
        } else {
            for (int i = start; i <= end; i++) {
                swap(buf, start, i);
                perm(buf, start + 1, end);
                swap(buf, start, i);
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
