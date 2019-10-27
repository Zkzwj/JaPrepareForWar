package com.zk.future.singleton.hungerAndFullSingletonPattern;

/**
 * 与饱汉相比较，饿汉很饿，总是想着吃，所以在最早的时机，即类加载初始化时初始化单例，以后访问时直接返回即可。
 *
 * 饿汉模式的好处是：天生线程安全（得益于类加载机制），而且使用时没有延迟
 * 坏处是：造成资源浪费（如果类加载后就一直不使用会造成资源浪费）
 */
public class HungerSingletonPattern {

    private static final HungerSingletonPattern singleton = new HungerSingletonPattern();

    private HungerSingletonPattern(){}

    public static HungerSingletonPattern getInstance(){
        return singleton;
    }
}
