package com.zk.future.singleton;

/**
 * 双重校验单例模式:
 * 考虑了线程安全，将对singleton的null判断以及new的部分使用synchronized进行加锁。
 * 同时，对singleton对象使用volatile关键字进行限制，保证其对所有线程的可见性，并且禁止对其进行指令重排序优化。
 * 如此即可从语义上保证这种单例模式写法是线程安全的。
 * @author zking
 *
 */
public class AgainCheckSingleThreadSingleton {

	private static volatile AgainCheckSingleThreadSingleton againCheckSingleThreadSingleton = null;

	private AgainCheckSingleThreadSingleton(){}

	public static AgainCheckSingleThreadSingleton getSingleton(){
		synchronized (AgainCheckSingleThreadSingleton.class) {
			if(againCheckSingleThreadSingleton == null)
				againCheckSingleThreadSingleton = new AgainCheckSingleThreadSingleton();
		}
		return againCheckSingleThreadSingleton;
	}

}