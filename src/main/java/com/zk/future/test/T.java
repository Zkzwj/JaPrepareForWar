package com.zk.future.test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class T {

    private static Test test = new Test();

    public static void main(String[] args) {
        String str = test.getStr();
        System.out.println(str);

        List list = new CopyOnWriteArrayList();
    }
}
