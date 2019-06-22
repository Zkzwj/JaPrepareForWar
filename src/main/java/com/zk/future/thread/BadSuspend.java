package com.zk.future.thread;

public class BadSuspend {

    public static Object u = new Object();
    static ChangObjectThread t1 = new ChangObjectThread("t1");
    static ChangObjectThread t2 = new ChangObjectThread("t2");

    public static class ChangObjectThread extends Thread{

        public ChangObjectThread(String name){
            super.setName(name);
        }
        @Override
        public void run() {
            System.out.println("in:"+getName());
            Thread.currentThread().suspend();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        t1.start();
        Thread.sleep(100);
        t2.start();
        t1.resume();
        t2.resume();
        t1.join();
        t2.join();
    }
}
