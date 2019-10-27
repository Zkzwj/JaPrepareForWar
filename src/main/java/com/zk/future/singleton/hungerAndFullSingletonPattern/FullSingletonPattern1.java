package com.zk.future.singleton.hungerAndFullSingletonPattern;

/**
 * 饱汉模式，即已经吃饱了不在着急吃了，饿的时候在吃，所以她就先不初始化单例，等第一次使用的时候在初始化，即“懒加载”
 *
 * 饱汉模式的核心就是懒加载，好处是启动速度快，节省资源，一直到实例被第一次访问，才需要初始化单例
 * 小坏处是：写起来麻烦
 * 大坏处是：多线程不安全，if语句存在竟态条件
 */
public class FullSingletonPattern1 {

    private static FullSingletonPattern1 singleton = null;

    private FullSingletonPattern1(){}

    public static FullSingletonPattern1 getInstance(){
        if (singleton == null){
            singleton = new FullSingletonPattern1();
        }
        return singleton;
    }
}
