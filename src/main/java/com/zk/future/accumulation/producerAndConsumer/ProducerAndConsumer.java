package com.zk.future.accumulation.producerAndConsumer;

import java.lang.management.ThreadInfo;

/**
 * @Author: zking
 * @Date: 2019/9/10 22:43
 * @Content:
 */
public class ProducerAndConsumer {

    private static Integer count = 0;
    private static final Integer FULL = 10;
    private static String LOCK = "lock";

    public static void main(String[] args) {
        ProducerAndConsumer pAndC = new ProducerAndConsumer();
        new Thread(pAndC.new Producer()).start();
        new Thread(pAndC.new Consumer()).start();

        new Thread(pAndC.new Producer()).start();
        new Thread(pAndC.new Consumer()).start();

        new Thread(pAndC.new Producer()).start();
        new Thread(pAndC.new Consumer()).start();

        new Thread(pAndC.new Producer()).start();
        new Thread(pAndC.new Consumer()).start();

        new Thread(pAndC.new Producer()).start();
        new Thread(pAndC.new Consumer()).start();

    }


    class Producer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    while (count.equals(FULL)) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + " 生产者生产，共有：" + count);
                    LOCK.notify();
                }
            }
        }
    }

    class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    while (count == 0) {
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + " 消费者消费，共有：" + count);
                    LOCK.notify();
                }
            }
        }
    }

}
