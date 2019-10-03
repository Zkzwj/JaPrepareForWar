package com.zk.future.thread.threadTX;

/**
 * @Author: zking
 * @Date: 2019/9/17 15:22
 * @Content:
 */
public class Volatile implements Runnable {

    private static volatile Boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println(Thread.currentThread().getName() + " - 执行");
        }
        System.out.println("线程结束");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Volatile());
        t.start();
        try {
            Thread.sleep(5);
            flag = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
