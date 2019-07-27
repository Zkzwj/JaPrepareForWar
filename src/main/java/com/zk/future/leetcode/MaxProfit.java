package com.zk.future.leetcode;

/**
 * @Author: zking
 * @Date: 2019/7/27 15:31
 * @Content:
 */
public class MaxProfit {

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
     * 注意你不能在买入股票前卖出股票。
     * 示例 1:
     * 输入: [7,1,5,3,6,4]
     * 输出: 5
     * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
     * 示例 2:
     * 输入: [7,6,4,3,1]
     * 输出: 0
     * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        maxProfit(nums);
        maxProfitYC(nums);
    }

    /**
     * 暴力解，时间复杂度n的方
     * @param nums
     */
    public static void maxProfit(int[] nums){
        int maxProfit = 0;
        for (int i = 0; i< nums.length; i++){
            for (int j = i+1; j<nums.length-1;j++){
                int profit = nums[j] - nums[i];
                if (profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        System.out.println("maxProfit:"+maxProfit);
    }

    /**
     * 一次解——动归
     * @param p
     */
    private static  void maxProfitYC(int[] p){
        int minPrice = p[0];
        int maxProfit = 0;
        for (int i = 1; i < p.length; i++){
            if (p[i] < minPrice)
                minPrice = p[i];
            else if (p[i] - minPrice > maxProfit)
                maxProfit = p[i] - minPrice;
        }
        System.out.println("maxProfit:"+maxProfit);
    }

}
