package com.zk.future.accumulation;

/**
 * @Author: zking
 * @Date: 2019/9/11 19:54
 * @Content:
 */
public class tips {

    // 不使用中间变量，交换两个变量的值

    public static void main(String[] args) {
        get();
        getA();
    }

    // 方法一：
    private static void get() {
        int a = 10;
        int b = 3;
        System.out.println("原数据：a=" + a + "  b=" + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("处理后：a=" + a + "  b=" + b);
    }


    private static void getA() {
        int a = 10;
        int b = 3;
        System.out.println("原数据：a=" + a + "  b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("处理后：a=" + a + "  b=" + b);
    }
}
