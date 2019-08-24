package com.zk.fight.proxyPattern.jdkDynamicAgent;

/**
 * @Author: zking
 * @Date: 2019/8/23 15:32
 * @Content:
 */
public class Apple implements Fruit{


    @Override
    public void show() {
        System.out.println("<<<<show method is invoked");
    }
}
