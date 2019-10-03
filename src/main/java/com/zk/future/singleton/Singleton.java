package com.zk.future.singleton;

/**
 * 饿汉模式:就是在第一次引用该类的时候就创建对象实例，而不管实际是否需要创建
 * @author zking
 *
 */
public class Singleton {

	//在静态初始化器中创建单例实例，这段代码保证了线程安全
	private static Singleton singleton = new Singleton();

	private Singleton(){}
	//Singleton类只有一个构造方法并且是被private修饰的，所以用户无法通过new方法创建该对象实例
	public static Singleton getSingleton(){
		return singleton;
	}

}
