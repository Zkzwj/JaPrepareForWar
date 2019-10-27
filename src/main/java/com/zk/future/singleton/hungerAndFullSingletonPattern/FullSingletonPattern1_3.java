package com.zk.future.singleton.hungerAndFullSingletonPattern;

/**
 * 相较于 FullSingletonPattern1_2 该单例模式使用volatile关键字禁止指令重排，即防止对象的部分初始化
 */
public class FullSingletonPattern1_3 {

    private static volatile FullSingletonPattern1_3 singleton = null;

    public int f1 = 1;
    public int f2 = 2;

    private FullSingletonPattern1_3(){}

    public static FullSingletonPattern1_3 getInstance(){
        if (singleton == null){
            synchronized(FullSingletonPattern1_3.class){
                if (singleton == null){
                    singleton = new FullSingletonPattern1_3();
                }
            }
        }
        return singleton;
    }
}
