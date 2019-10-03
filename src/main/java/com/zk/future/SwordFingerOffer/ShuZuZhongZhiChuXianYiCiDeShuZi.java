package com.zk.future.SwordFingerOffer;

import com.zk.future.test.S;
import com.zk.interview.yuanfudao.ShuZuShiXianLiangGeZhan;

import java.util.HashMap;

/**
 * @Author: zking
 * @Date: 2019/9/16 17:57
 * @Content:
 */
public class ShuZuZhongZhiChuXianYiCiDeShuZi {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8};
        ShuZuZhongZhiChuXianYiCiDeShuZi s = new ShuZuZhongZhiChuXianYiCiDeShuZi();
        s.FindNumsAppearOnce(arr, new int[1], new int[1]);
    }

    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int len = array.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        int[] arr = new int[2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (map.get(array[i]) == 1) {
                arr[count] = array[i];
                count++;
            } else {
                continue;
            }
        }
        num1[0] = arr[0];
        num2[0] = arr[1];
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }


    public void FindNumsAppearOnce1(int[] array, int num1[], int num2[]) {
        if (array == null || array.length < 2) {
            return;
        }
        int res = 0;
        for (int num : array) {
            res ^= num;
        }
        int index = 0;
        while ((res & 1) == 0) {
            index++;
            res = res >> 1;
        }
        for (int num : array) {
            if ((num >> index & 1) != 0) {
                num1[0] ^= num;
            } else {
                num2[0] ^= num;
            }
        }
    }

}
