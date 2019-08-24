package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/24 19:34
 * @Content:
 */
public class ReOrderArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 7, 8, 6};
        reOrderArray(arr);
        reOrderArray1(arr);
    }

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */
    private static void reOrderArray(int[] array) {
        // 用一种很low的方式可以解决，即声明两个数组，用于存放两个奇数和偶数数组，最后合并,浪費空間
        int len = array.length;
        int[] j = new int[len];
        int[] o = new int[len];
        int js = 0;
        int os = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 != 0) {
                // 奇数+
                j[js] = array[i];
                js++;
            } else {
                // 偶数
                o[os] = array[i];
                os++;
            }
        }
        for (int i = 0; i < os; i++) {
            j[js] = o[i];
            js++;
        }
        System.out.println(j);
    }

    public static void reOrderArray1(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        System.out.println(array);
    }

}
