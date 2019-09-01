package com.zk.interview.yuanfudao;

/**
 * @Author: zking
 * @Date: 2019/8/30 17:09
 * @Content: 最长增序列长度
 */
public class ZuiChangLianXuDiZengXuLie {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 3, 2, 5, 1, 10};
        int lengthOfLCIS = getMax(nums);
        System.out.println(lengthOfLCIS);
    }

    public static int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int point = 1, max = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1]) {
                point++;
            } else {
                point = 1;
            }
            if (point > max)
                max = point;
        }
        return max;
    }


    public static int getMax(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int point = 1;
        int max = 1;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                point++;
            } else {
                point = 1;
            }
            if (point > max) {
                max = point;
            }
        }
        return max;
    }

}
