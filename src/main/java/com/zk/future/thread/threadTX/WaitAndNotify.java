package com.zk.future.thread.threadTX;

/**
 * @Author: zking
 * @Date: 2019/9/17 15:11
 * @Content:
 */
public class WaitAndNotify {

    private static Object lock = new Object();
    private static int i = 0;

    public void odd(){
        while (i < 10) {
            synchronized (lock){
                if (i % 2 == 1){
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void even() {
        while (i < 10) {
            synchronized (lock) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        WaitAndNotify waitNotify = new WaitAndNotify();

        Thread t1 = new Thread(() -> waitNotify.odd(), "线程1");
        Thread t2 = new Thread(() -> waitNotify.even(), "线程2");

        t1.start();
        t2.start();
    }
}
