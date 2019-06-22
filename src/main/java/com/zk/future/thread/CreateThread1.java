package com.zk.future.thread;

public class CreateThread1 {

    /**
     * 注意run方法和start方法的区别
     * @param args
     */
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.run();
    }
}
