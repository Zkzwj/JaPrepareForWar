package com.zk.future.singleton.hungerAndFullSingletonPattern;

/**
 * 针对FullSingletonPattern1_1中的单例初始化后锁仍是无法避免的问题，本单例在FullSingletonPattern1_1的外层又套上了一层check，
 * 加上synchronized内层的check，即所谓“双重检查锁”——Double Check Lock——DCL
 *
 * 该单例看起来：懒加载+线程安全，但是可惜的是，DCL仍是线程不安全的——指令重排会让程序得到“半个对象”
 */
public class FullSingletonPattern1_2 {

    private static FullSingletonPattern1_2 singleton = null;

    public int f1 = 1;// 触发部分初始化问题
    public int f2 = 2;

    private FullSingletonPattern1_2(){}

    public static FullSingletonPattern1_2 getInstance(){
        if (singleton == null){
            synchronized (FullSingletonPattern1_2.class){
                if (singleton == null){
                    singleton = new FullSingletonPattern1_2();
                }
            }
        }
        return singleton;
    }
}
