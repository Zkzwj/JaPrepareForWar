package com.zk.future.accumulation.producerAndConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: zking
 * @Date: 2019/9/10 22:56
 * @Content:
 */
public class ProducerAndConsumer2 {

    private static Integer count = 0;
    private BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) {
        ProducerAndConsumer2 pAndC = new ProducerAndConsumer2();
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

    class Producer implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    blockingQueue.put(1);
                    count++;
                    System.out.println(Thread.currentThread().getName() + " 生产者生产，共有：" + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Consumer implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    blockingQueue.take();
                    count--;
                    System.out.println(Thread.currentThread().getName() + " 消费者消费，共有：" + count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
