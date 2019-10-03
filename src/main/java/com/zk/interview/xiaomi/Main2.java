package com.zk.interview.xiaomi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/6 18:TC58
 * @Content:
 */
public class Main2 {

    /**
     * 第1行为产品种类数
     * 接下来的每行为每种产品的价格
     * 最后一行为预算金额
     * 能买到的最少的产品的件数，无法没有匹配的返回-1
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _prices_size = 0;
        _prices_size = Integer.parseInt(in.nextLine().trim());
        int[] _prices = new int[_prices_size];
        int _prices_item;
        for(int _prices_i = 0; _prices_i < _prices_size; _prices_i++) {
            _prices_item = Integer.parseInt(in.nextLine().trim());
            _prices[_prices_i] = _prices_item;
        }

        int _budget;
        _budget = Integer.parseInt(in.nextLine().trim());

        res = solution(_prices, _budget);
        System.out.println(String.valueOf(res));
    }


    /**
     * 小米之家有很多米粉喜欢的产品，产品种类很多，价格也不同。
     * 比如某签字笔1元，某充电宝79元，某电池1元，某电视1999元等
     * 假设库存不限，小明去小米之家买东西，要用光N元预算的钱，
     * 请问他最少能买几件产品
     */
    public static int solution(int[] prices, int budget){
        Arrays.sort(prices);
        int len = prices.length;
        int i = 0;
        for (int j = len -1; j >= 0; j--){
            while (i < len && i * prices[j] <= budget){
                i++;
            }
            budget = budget - i * prices[j];
            if (budget == 0){
                return i;
            }
        }
        return 0;
    }

}
