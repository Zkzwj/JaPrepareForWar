package com.zk.future.singleton;

/**
 * AgainCheckSingleThreadSingleton可以正确运行的,但是其效率低下，还是无法实际应用。
 * 因为每次调用getSingleton()方法，都必须在synchronized这里进行排队，而真正遇到需要new的情况是非常少的。
 * @author zking
 * 详情：可见http://www.importnew.com/18872.html
 */
public class AgainCheckSingleThreadSingletonOptimization {

	private static volatile AgainCheckSingleThreadSingletonOptimization againCheckSingleThreadSingletonOptimization = null;

	private AgainCheckSingleThreadSingletonOptimization(){}

	public static AgainCheckSingleThreadSingletonOptimization getSingleton(){
		if (againCheckSingleThreadSingletonOptimization == null) {
			synchronized (AgainCheckSingleThreadSingletonOptimization.class) {
				if (againCheckSingleThreadSingletonOptimization == null) {
					againCheckSingleThreadSingletonOptimization = new AgainCheckSingleThreadSingletonOptimization();
				}
			}
		}
		return againCheckSingleThreadSingletonOptimization;
	}

}
