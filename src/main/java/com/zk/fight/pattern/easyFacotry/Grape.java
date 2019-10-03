package com.zk.fight.pattern.easyFacotry;

/**
 * @Author: zking
 * @Date: 2019/9/12 10:35
 * @Content:
 */
public class Grape extends Fruit {
    @Override
    void grow() {
        System.out.println("Grape grow()");
    }

    @Override
    void harvest() {
        System.out.println("Grape harvest()");
    }

    @Override
    void plant() {
        System.out.println("Grape plant()");
    }
}
