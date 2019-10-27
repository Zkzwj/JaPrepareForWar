package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/6 17:42
 * @Content:
 */
public class TiaoTaiJie {

    public static void main(String[] args) {

    }

    private int jumpF(int target) {
        if (target == 1 || target == 0) {
            return 1;
        } else {
            return jumpF(target - 1) + jumpF(target - 2);
        }
    }

    private int jumpFII(int target) {
        if (target <= 2) {
            return target;
        } else {
            return jumpFII(target - 1) * 2;
        }

    }
}
