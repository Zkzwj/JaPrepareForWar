package com.zk.fight.pattern.jdkDynamicAgent.other;

/**
 * @Author: zking
 * @Date: 2019/8/23 14:59
 * @Content:
 */
public class Actor implements Person {

    private String content;

    public Actor(String content) {
        this.content = content;
    }

    @Override
    public void speak() {
        System.out.println(this.content);
    }
}
