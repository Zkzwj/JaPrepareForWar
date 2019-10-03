package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/6 20:31
 * @Content:
 */
public class ShuZuJiOuPaiXu {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reOrderArray(arr);
    }


    private static void reOrderArray(int[] array) {
        int len = array.length;
        int jLen = 0;
        int oLen = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 0) {
                oLen++;
            } else {
                jLen++;
            }
        }
        int[] j = new int[jLen];
        int[] o = new int[oLen];
        int jPos = 0, oPos = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] % 2 == 0) {
                o[oPos] = array[i];
                oPos++;
            } else {
                j[jPos] = array[i];
                jPos++;
            }
        }
        System.arraycopy(j, 0, array, 0, jLen);
        System.arraycopy(o, 0, array, jLen, oLen);
    }

}
