package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/12 17:02
 * @Content:
 */
public class ZuiDaShuZuZiHe {


    public static void main(String[] args) {
        int[] arr = {6, -3, -2, 7, -15, 1, 2, 2};
        int i = FindGreatestSumOfSubArray(arr);
        System.out.println(i);
    }


    private static int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        if (len == 0) {
            return 0;
        }
        int max = array[0];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += array[i];
            if (sum > max){
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
