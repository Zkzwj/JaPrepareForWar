package com.zk.future.singleton;

/**
 * AgainCheckSingleThreadSingleton可以正确运行的,但是其效率低下，还是无法实际应用。
 * 因为每次调用getSingleton()方法，都必须在synchronized这里进行排队，而真正遇到需要new的情况是非常少的。
 * @author zking
 * 详情：可见 https://blog.csdn.net/qq_34337272/article/details/80455972
 */
public class AgainCheckSingleThreadSingletonOptimization {

	//volatile保证，当uniqueInstance变量被初始化成Singleton实例时，多个线程可以正确处理uniqueInstance变量
	private static volatile AgainCheckSingleThreadSingletonOptimization againCheckSingleThreadSingletonOptimization = null;

	private AgainCheckSingleThreadSingletonOptimization(){}

	public static AgainCheckSingleThreadSingletonOptimization getSingleton(){
		//检查实例，如果不存在，就进入同步代码块
		if (againCheckSingleThreadSingletonOptimization == null) {
			// 只有第一次才彻底执行这里的代码
			synchronized (AgainCheckSingleThreadSingletonOptimization.class) {
				//进入同步代码块后，再检查一次，如果仍是null，才创建实例
				if (againCheckSingleThreadSingletonOptimization == null) {
					againCheckSingleThreadSingletonOptimization = new AgainCheckSingleThreadSingletonOptimization();
				}
			}
		}
		return againCheckSingleThreadSingletonOptimization;
	}

}
