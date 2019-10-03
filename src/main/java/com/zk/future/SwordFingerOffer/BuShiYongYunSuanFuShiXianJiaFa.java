package com.zk.future.SwordFingerOffer;

import com.zk.future.test.B;

/**
 * @Author: zking
 * @Date: 2019/9/22 19:35
 * @Content:
 */
public class BuShiYongYunSuanFuShiXianJiaFa {

    public static void main(String[] args) {
        BuShiYongYunSuanFuShiXianJiaFa b = new BuShiYongYunSuanFuShiXianJiaFa();
        int add = b.Add(10, 21);
        System.out.println(add);

    }

    public int Add(int num1, int num2){
        int num3=0;
        int num4 = 0;
        do {
            num3 = num1 ^ num2;
            num4 = (num1 & num2) << 1;
            num1 = num3;
            num2 = num4;
        }while (num4 != 0);
        return (num1 | num2);
    }

}
