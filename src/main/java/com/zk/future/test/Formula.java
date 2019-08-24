package com.zk.future.test;

/**
 * @Author: zking
 * @Date: 2019/8/19 11:57
 * @Content:
 */
public interface Formula {

    double calculate(int a);

    default double sort(double a){
        return Math.sqrt(a);
    }
}
