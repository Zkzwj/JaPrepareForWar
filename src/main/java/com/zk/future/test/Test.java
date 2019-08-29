package com.zk.future.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test extends TestAbstract{
    static int co = 0;
    int cc = 0;
    public static void main(String[] args) {
        // 1.数组中两个元素的和=target +3
        int[] arr = {1,2,3,4};
        int target = 4;
        // 2.浮点数平方和

        // 3.int [] arr = {1,2,2,3,3,3,3,4,4,4,5,5,10}. k = 2. 如果次数大于2就删除。返回{1,2,2,5,5,10}

        // 4.一个双向链表，拆成奇数链表和偶数链表。

        // 5.(A,B)(A,C)(B,D)(D,A)判断是否有循环引用，提示用拓扑排序（尴尬，没看过😂，换了超简单的第二题做出来了）

        // 6.蛇形打印二叉树

        // 7.排序一个字符串 时间要求O(n)

        // 8.最大正方形面积(不会换题)

        // 9.奇数上升偶数下降的链表排序 空间要求O(1)

        // 10.给一个有重复数字的数组，求集合{(a,b,c) | a+b+c=0}

        // 11.二分查找（递归与非递归）

        // 12.删除链表多个值

        // 13.给定了100*1、50*1、20*2等一些钱的数额以及数量，给定金额，需要输出使用最少的数量的钱来凑成指定金额，如果不能凑出，则输出失败。
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 != 0 || i % 5 != 0) {
                count++;
            }
        }
        System.out.println(count);
        f(10);
        System.out.println(co);
        System.out.println(Integer.MAX_VALUE);


        int te = 128;
        // 右移一位相当于2的幂指数-1
        System.out.println(te >> 1);
        // 右移2位相当于2的幂指数-2
        System.out.println(te >> 2);

        // 左移一位相当于2的幂指数+1
        System.out.println(te << 1);

        // 左移一位相当于2的幂指数+2
        System.out.println(te << 2);

        // & 运算 二进制为对比都为1 才为1
        int st = 128;
        int et = 129;
        System.out.println(Integer.toBinaryString(st));
        System.out.println(Integer.toBinaryString(et));
        System.out.println(128 & 129);
        int c = 0;
        while (et != 0) {
            c++;
            et = (et - 1) & et;
        }
        System.out.println(c);


        Test test = new Test();
        System.out.println(test);
        Map map = new HashMap();
        map.hashCode();


        int h = 10230492;
        int len = 128;

        System.out.println(h%len);
        System.out.println(h&(len-1));

        System.out.println(1 << 30);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = hash * 31 + cc;
        return hash;
    }

    public static int f(int x) {
        co++;
        if (x <= 2) {
            return 1;
        }
        return f(x - 2) + f(x - 4) + 1;
    }


}
