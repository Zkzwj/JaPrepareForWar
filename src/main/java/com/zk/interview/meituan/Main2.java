package com.zk.interview.meituan;

import java.math.BigDecimal;

/**
 * @Author: zking
 * @Date: 2019/9/11 15:59
 * @Content:
 */
public class Main2 implements Runnable{

    // 打印次数
    private static final int PRINT_COUNT = 10;
    // 前一个线程打印
    private Object fontLock;
    // 本线程打印锁
    private   Object thisLock;
    // 打印字符
    private   char printChar;

    public Main2(Object fontLock, Object thisLock, char printChar) {
        this.fontLock = fontLock;
        this.thisLock = thisLock;
        this.printChar = printChar;
    }

    public Main2() {
    }

    @Override
    public void run() {
        // 连续打印次数
        for (int i = 0; i < PRINT_COUNT; i++) {
            // 获取前一个线程的打印锁
            synchronized (fontLock) {
                // 获取本线程的打印锁
                synchronized (thisLock) {
                    // 打印
                    System.out.print(printChar);
                    // 通过本线程的打印锁唤醒后面的线程
                    thisLock.notify();
                }
                // 不是最后一次则通过fontLock等待被唤醒
                // 必须要加判断，不然虽然能够打印10次，但10次后就会直接死锁
                if (i < PRINT_COUNT - 1) {
                    try {
                        // 通过fontLock等待被唤醒
                        fontLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Object lockA = new Object();
        Object lockB = new Object();
        Object lockC = new Object();

        Thread tA = new Thread(new Main2(lockC, lockA, 'A'));
        Thread tB = new Thread(new Main2(lockA, lockB, 'B'));
        Thread tC = new Thread(new Main2(lockB, lockC, 'C'));

        tA.start();
        Thread.sleep(100);
        tB.start();
        Thread.sleep(100);
        tC.start();
        Thread.sleep(100);
    }


}
