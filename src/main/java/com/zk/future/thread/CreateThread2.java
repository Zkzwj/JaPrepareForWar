package com.zk.future.thread;

public class CreateThread2 {

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("hello, I am t1");
            }
        };
        t1.start();
    }

}
