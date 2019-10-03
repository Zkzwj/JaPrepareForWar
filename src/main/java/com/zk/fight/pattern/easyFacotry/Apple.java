package com.zk.fight.pattern.easyFacotry;

/**
 * @Author: zking
 * @Date: 2019/9/12 10:35
 * @Content:
 */
public class Apple extends Fruit{

    private int age;

    @Override
    void grow() {
        System.out.println("Apple grow()");
    }

    @Override
    void harvest() {
        System.out.println("Apple harvest()");
    }

    @Override
    void plant() {
        System.out.println("Apple plant()");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
