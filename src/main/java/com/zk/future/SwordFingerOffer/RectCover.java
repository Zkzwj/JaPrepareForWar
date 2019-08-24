package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/24 18:58
 * @Content:
 */
public class RectCover {

    /**
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     *
     * 这题的关键是能确定出他是斐波那契
     */

    public static void main(String[] args) {
        int n = 3;
        int i = rectCover(n);
        System.out.println(i);
    }

    private static int rectCover(int target){
        if (target < 0) {
            return 0;
        }
        if (target == 1 ||target ==2) {
            return target;
        }else {
            return rectCover(target-1)+rectCover(target-2);
        }
    }
}
