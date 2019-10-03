package com.zk.fight.pattern.jdkDynamicAgent;

/**
 * @Author: zking
 * @Date: 2019/8/23 15:39
 * @Content:
 */
public class ReflectTest {
    public static void main(String[] args) {
        Fruit fruit = (Fruit) DynamicAgent.agent(Fruit.class, new Apple());
        fruit.show();
    }
}
