package com.zk.future.accumulation.thread;

/**
 * @Author: zking
 * @Date: 2019/9/6 14:00
 * @Content:
 */
public class ThreadLianXuDaYin {

    private static int i = 1;

    public static void main(String[] args) {
        ThreadLianXuDaYin t = new ThreadLianXuDaYin();
        Runnable r = new Runnable(){
            @Override
            public void run() {
                while (t.i < 10){
                    synchronized (this){
                        notify();
                        System.out.println(Thread.currentThread().getName()+" "+i++);
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        new Thread(r).start();
        new Thread(r).start();
    }
}
