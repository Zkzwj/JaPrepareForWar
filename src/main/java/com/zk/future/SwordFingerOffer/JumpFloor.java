package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/24 16:57
 * @Content:
 */
public class JumpFloor {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     */
    public static void main(String[] args) {
        int target = 5;
        int re = jumpFloor(target);
        System.out.println("递归："+re);
        int res = jumpFloor2(target);
        System.out.println("非递归："+res);
    }

    /**
     * 递归--斐波那契
     * @param target
     * @return
     */
    private static int jumpFloor(int target){
        if (target <= 2){
            return target;
        }else {
            int re = jumpFloor(target - 1) + jumpFloor(target - 2);
            return re;
        }
    }

    private static int jumpFloor2(int target){
        int result = 0,f = 1,s = 2;
        if (target <= 2){
            return target;
        }
        for (int i = 3; i<= target; i++){
            result = f + s;
            f = s;
            s = result;
        }
        return result;
    }
}
