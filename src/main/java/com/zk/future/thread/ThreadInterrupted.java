package com.zk.future.thread;

public class ThreadInterrupted {

    public static void main(String[] args) throws InterruptedException {
        interruptToDONothing();
        interruptDoSomething();
    }

    /**
     * 该方法只是对t1线程进行了中断，但对t1并没有中断的逻辑处理，因此即使t1被置于中断状态，这个中断状态也不会起作用
     * @throws InterruptedException
     */
    private static void interruptToDONothing() throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true){
                    Thread.yield();
                }
            }
        };
        t1.start();
        Thread.sleep(100);
        t1.interrupt();
    }

    /**
     * 起作用
     * @throws InterruptedException
     */
    private static void interruptDoSomething() throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true){
                    if (Thread.currentThread().isDaemon()){
                        System.out.println("Current Thread Is Instrrupted");
                        break;
                    }
                    Thread.yield();
                }
            }
        };
        t1.start();
        Thread.sleep(100);
        t1.interrupt();
    }
}
