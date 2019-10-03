package com.zk.fight.pattern.easyFacotry;

/**
 * @Author: zking
 * @Date: 2019/9/12 10:35
 * @Content:
 */
public class Strawberry extends Fruit {
    @Override
    void grow() {
        System.out.println("Strawberry grow()");
    }

    @Override
    void harvest() {
        System.out.println("Strawberry harvest()");
    }

    @Override
    void plant() {
        System.out.println("Strawberry plant()");
    }
}
