package com.zk.test;

public class Test2 {

    public static void main(String[] args) {
        String[] str = new String[5];
        for (int x = 0; x < args.length; x++){
            str[x] = args[x];
        }
        System.out.println(str[2]);
    }
}
