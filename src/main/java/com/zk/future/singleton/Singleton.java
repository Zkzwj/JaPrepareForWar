package com.zk.future.singleton;

/**
 * 饿汉模式:就是在第一次引用该类的时候就创建对象实例，而不管实际是否需要创建
 * @author zking
 *
 */
public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton(){}

	public static Singleton getSingleton(){
		return singleton;
	}

}
