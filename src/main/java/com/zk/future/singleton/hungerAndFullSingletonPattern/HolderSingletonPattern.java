package com.zk.future.singleton.hungerAndFullSingletonPattern;

/**
 * 我们即希望利用饿汉模式中静态变量的方便和线程安全，又希望通过懒加载规避资源浪费，
 * Holder模式满足这两点要求：核心仍是静态变量，足够方便和线程安全，
 * 通过静态的Holder类持有的真正实例，间接实现懒加载
 */
public class HolderSingletonPattern {

    private static class SingletonHolder{
        private static final HolderSingletonPattern singleton = new HolderSingletonPattern();
        private SingletonHolder(){}
    }

    private HolderSingletonPattern(){}

    public static HolderSingletonPattern getInstance(){
        return SingletonHolder.singleton;
    }
}
