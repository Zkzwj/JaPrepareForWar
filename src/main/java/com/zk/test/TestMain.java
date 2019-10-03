package com.zk.test;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: zking
 * @Date: 2019/9/3 9:59
 * @Content:
 */
public class TestMain implements Runnable {

    private int age;
    private int hu;

    public static final ThreadPoolExecutor executor = null;

    public static void main(String[] args) {
        TestMain t = new TestMain(1, 2);
        executor.execute(t);
        System.out.println();
    }

    public TestMain(int age, int hu) {
        this.age = age;
        this.hu = hu;
    }

    @Override
    public void run() {
        System.out.println("调用");
    }


}
