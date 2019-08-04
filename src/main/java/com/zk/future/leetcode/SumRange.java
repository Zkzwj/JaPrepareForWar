package com.zk.future.leetcode;


import javafx.util.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zking
 * @Date: 2019/7/27 22:59
 * @Content:
 */
public class SumRange {

    private static int[] data;

    /**
     * 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
     * 示例：
     * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
     * sumRange(0, 2) -> 1
     * sumRange(2, 5) -> -1
     * sumRange(0, 5) -> -3
     * 说明:
     * 你可以假设数组不可变。
     * 会多次调用 sumRange 方法。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Arrays.sort(nums);
        numArray(nums);
        int i = sumRange(0, 2);
        System.out.println(i);
    }

    public static void numArray(int[] nums) {
        data = nums;
    }

    public static int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += data[k];
        }
        return sum;
    }

    // ----------------------

    private static int[] sum;
    public static void numArray1(int[] nums) {
        sum = new int[nums.length+1];
        for (int i = 0; i <nums.length; i++){
            sum[i+1] = sum[i] + nums[i];
        }
    }

    private static void sunRange1(int i, int j){
        System.out.println(sum[j+1] - sum[i]);
    }
}
