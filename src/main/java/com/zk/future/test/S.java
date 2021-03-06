package com.zk.future.test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zking
 * @Date: 2019/8/30 20:09
 * @Content:
 */
public class S {

    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,-4};
        int i = maxSubArray(arr);
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];
        int head = 0;
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]); //核心代码
            if (dp[i - 1] + nums[i] < nums[i])
                head = i;
        }

        int max = dp[0]; //找最大和
        for (int i = 0; i < dp.length; i++) {
            if (max < dp[i])
                max = dp[i];
        }
        return max;

    }
}