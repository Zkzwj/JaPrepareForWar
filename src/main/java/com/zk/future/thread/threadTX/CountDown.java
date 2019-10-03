package com.zk.future.thread.threadTX;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: zking
 * @Date: 2019/9/17 15:24
 * @Content:
 */
public class CountDown {

    private static Integer i = 0;
    final static CountDownLatch countDown = new CountDownLatch(1);

    public void odd() {
        while (i < 10) {
            if (i % 2 == 1) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                countDown.countDown();
            } else {
                try {
                    countDown.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void even() {
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                countDown.countDown();
            } else {
                try {
                    countDown.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        CountDown countDown = new CountDown();

        Thread t1 = new Thread(() -> countDown.odd(), "线程1");
        Thread t2 = new Thread(() -> countDown.even(), "线程2");

        t1.start();
        t2.start();
    }
}