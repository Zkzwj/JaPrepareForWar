package com.zk.fight.proxyPattern;

/**
 * @Author: zking
 * @Date: 2019/8/23 15:00
 * @Content:
 */
public class StaticProxy {
    public static void main(String[] args) {
        Actor actor = new Actor("I am a famous actor!");
        Agent agent = new Agent(actor, "Hello I am an agent.", "That's all!");
        agent.speak();
    }
}
