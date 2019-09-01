package com.zk.interview.yuanfudao;

/**
 * @Author: zking
 * @Date: 2019/8/30 16:14
 * @Content:
 */
public class MySqrt {


    public static int mySqrt(int x) {
        int low = 0;
        int up = x;
        while (low <= up) {
            long mid = (low + up) / 2;
            long s = mid * mid;
            if (x == s) {
                return (int) mid;
            } else if (x > s) {
                low = (int) (mid + 1);
            } else {
                up = (int) (mid - 1);
            }
        }
        return up;
    }

    public static void main(String[] args) {
        int i = mySqrt(1000);
        System.out.println(i);
    }
}
