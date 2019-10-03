package com.zk.future.thread.ch2;

/**
 * @Author: zking
 * @Date: 2019/9/28 16:25
 * @Content:
 */
public class DaemonDemo {

    public static class DaemonT extends Thread {

        @Override
        public void run() {
            while (true) {
                System.out.println("I am alive");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new DaemonT();

        /**
         * Java中有两类线程：User Thread -> 用户线程 & Daemon Thread ->守护线程
         * 任何一个守护线程都是整个JVM中所有非守护线程的保姆，只要当前JVM实例中尚存在任何一个非守护进程没有结束，守护线程就全部工作
         * 只有当最后一个非守护线程结束时，守护线程随之JVM一同结束工作。
         * GC Thread & JIT Thread 均为守护线程
         * User和Daemon两者几乎没有区别，唯一的不同之处就在于虚拟机的离开：如果User Thread已经全部退出运行，只剩下Daemon Thread存在，
         * 虚拟机也就退出了。因为没有了被守护者，Daemon也就没有工作可做了，也就没有继续运行程序的必要了。
         * 守护线程优先级比较低，用于为系统中的其它对象和线程提供服务
         */
        t.setDaemon(true);//  若是将这句注释了，会无限打印

        t.start();
        Thread.sleep(100);

    }
}
