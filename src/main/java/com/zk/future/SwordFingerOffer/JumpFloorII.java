package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/24 18:31
 * @Content:
 */
public class JumpFloorII {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */

    public static void main(String[] args) {
        int target = 5;
        int re = jumpFloor2(target);
        System.out.println(re);
        System.out.println("bit operation:"+(1 << --target));
    }

    private static int jumpFloor2(int target) {
        //return 1 << --target;
        if (target <= 2) {
            return target;
        } else {
            return jumpFloor2(target - 1) * 2;
        }
    }
}
