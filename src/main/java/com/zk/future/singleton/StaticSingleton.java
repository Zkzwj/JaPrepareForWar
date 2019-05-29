package com.zk.future.singleton;

/**
 * 静态内部类模式
 */
public class StaticSingleton {
	
	private static class Holder{
		private static StaticSingleton staticSingleton = new StaticSingleton();
	}
	
	private StaticSingleton(){}
	
	public static StaticSingleton getStaticSingleton(){
		return Holder.staticSingleton;
	}

}
