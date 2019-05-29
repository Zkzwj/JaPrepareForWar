package com.zk.future.singleton;

/**
 * 单线程单例模式：
 * 私有构造器和一个公有静态工厂方法构成，在工厂方法中对singleton进行null判断，如果是null就new一个出来，最后返回singleton对象。
 * 这种方法可以实现延时加载，但是有一个致命弱点：线程不安全。如果有两条线程同时调用getSingleton()方法，就有很大可能导致重复创建对象
 * @author zking
 *
 */
public class SingleThreadSingleton {

	private static SingleThreadSingleton singleThreadSingleton = null;

	private SingleThreadSingleton(){}

	public static SingleThreadSingleton getSingleton(){
		if(singleThreadSingleton == null)
			singleThreadSingleton = new SingleThreadSingleton();
		return singleThreadSingleton;
	}

}
