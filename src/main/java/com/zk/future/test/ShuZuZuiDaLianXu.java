package com.zk.future.test;

import java.util.HashSet;

/**
 * @Author: zking
 * @Date: 2019/9/12 16:49
 * @Content:
 */
public class ShuZuZuiDaLianXu {

    public static void main(String[] args) {
        int[] arr = {9, 8, 6, 5, 4, 3, 2, 1};
        int i = longestConsecutive(arr);
        System.out.println(i);

    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longnum = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int current = num;
                int currentStreak = 1;
                while (set.contains(current + 1)) {
                    current += 1;
                    currentStreak += 1;
                }
                longnum = Math.max(currentStreak, longnum);
            }
        }
        return longnum;
    }
}
