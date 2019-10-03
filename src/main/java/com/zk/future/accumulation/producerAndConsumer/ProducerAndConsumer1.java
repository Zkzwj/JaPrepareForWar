package com.zk.future.accumulation.producerAndConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zking
 * @Date: 2019/9/11 10:39
 * @Content:
 */
public class ProducerAndConsumer1 {

    private static Integer count = 0;
    private static final Integer FULL = 10;

    private Lock lock = new ReentrantLock();

    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public static void main(String[] args) {
        ProducerAndConsumer1 pAndC = new ProducerAndConsumer1();

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
                lock.lock();
                try {
                    while (count.equals(FULL)) {
                        try {
                            notFull.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + " 生产者生产，目前共有：" + count);
                    notEmpty.signal();
                } finally {
                    lock.unlock();
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
                lock.lock();
                try {
                    while (count == 0){
                        try {
                            notEmpty.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + " 消费者消费，目前共有：" + count);
                    notFull.signal();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

}
