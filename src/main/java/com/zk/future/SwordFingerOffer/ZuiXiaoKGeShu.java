package com.zk.future.SwordFingerOffer;

import java.util.ArrayList;

/**
 * @Author: zking
 * @Date: 2019/9/12 16:59
 * @Content:
 */
public class ZuiXiaoKGeShu {

    public static void main(String[] args) {
        ZuiXiaoKGeShu z = new ZuiXiaoKGeShu();
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        ArrayList<Integer> arrayList = z.GetLeastNumbers_Solution(arr, 4);
        System.out.println(arrayList);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (input == null || k <= 0 || k > input.length) return result;
        for (int i = 0; i <= k - 1; i++) {
            for (int j = i + 1; j <= input.length - 1; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
            result.add(input[i]);
        }
        return result;
    }
}

