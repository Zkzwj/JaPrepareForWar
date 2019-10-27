package com.zk.future.singleton.hungerAndFullSingletonPattern;

/**
 * 相较于FullSingletonPattern1，该实例方法添加synchronized关键字，达到绝对的线程安全
 * 好处是：写起来简单
 * 坏处是：并发性能极差没，事实上完全退化到串行，单例只需要初始化一次，但就算初始化以后，synchronized的锁也是无法避开的
 * 从而getInstance() 完全变成了串行操作。
 * 性能不敏感的场景建议使用
 */
public class FullSingletonPattern1_1 {

    private static FullSingletonPattern1_1 singleton = null;

    private FullSingletonPattern1_1(){}

    public synchronized static FullSingletonPattern1_1 getInstance(){
        if (singleton == null){
            singleton = new FullSingletonPattern1_1();
        }
        return singleton;
    }
}
