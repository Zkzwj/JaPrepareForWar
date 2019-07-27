package com.zk.future.leetcode;

/**
 * @Author: zking
 * @Date: 2019/7/23 23:15
 * @Content:
 */
public class MaxSubArray {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(arr);
        System.out.println(i);
    }

    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 示例:
     * 输入: [-2,1,-3,4,-1,2,1,-5,4],
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     * 进阶:
     * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int[] maxto = new int[nums.length];
        maxto[0] = nums[0];
        int res = maxto[0];
        for (int i = 1; i < maxto.length; i++){
            maxto[i] = Math.max(nums[i] + maxto[i - 1], nums[i]);
            if (maxto[i] > res){
                res = maxto[i];
            }
        }
        return res;
    }


    public int maxSubArray1(int[] nums) {
        int[] maxto = new int[nums.length];
        maxto[0] = nums[0];
        int res = maxto[0];
        for(int i = 1 ; i < maxto.length ; i ++){
            maxto[i] = Math.max(nums[i]+maxto[i-1],nums[i]);
            if(maxto[i] > res)
                res = maxto[i];
        }
        return res;
    }
}
