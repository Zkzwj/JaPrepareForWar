package com.zk.future.thread;

public class JoinMain {

    public volatile static int i = 0;

    public static class AddThread extends Thread{
        @Override
        public void run() {
            for (i=0;i<10000;i++);
        }
    }

    /**
     * 可注释 at.join(); 查看效果
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        AddThread at = new AddThread();
        at.start();
        at.join();
        System.out.println(i);
    }

}
