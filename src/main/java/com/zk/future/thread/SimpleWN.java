package com.zk.future.thread;

public class SimpleWN {

    final static Object ob = new Object();

    public static class T1 extends Thread{
        @Override
        public void run() {
            synchronized (ob){
                System.out.println(System.currentTimeMillis()+":T1 Start");
                System.out.println(System.currentTimeMillis()+":T1 wait for ob");
                try {
                    ob.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(System.currentTimeMillis()+":T1 End");
            }
        }
    }


    public static class T2 extends Thread{
        @Override
        public void run() {
            synchronized (ob){
                System.out.println(System.currentTimeMillis()+":T2 start notify one thread ");
                ob.notify();
                System.out.println(System.currentTimeMillis()+":T2 End");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();
        t1.start();
        t2.start();
    }
}
