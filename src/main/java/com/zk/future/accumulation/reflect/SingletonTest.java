package com.zk.future.accumulation.reflect;

import com.zk.future.test.S;

import java.lang.reflect.Constructor;

/**
 * @Author: zking
 * @Date: 2019/9/22 15:32
 * @Content:
 */
public class SingletonTest {


    private  SingletonTest(){
        System.out.println("无参构造");
    }

    private SingletonTest(String a){
        System.out.println("有参构造："+a);
    }

    private static volatile SingletonTest instance;

    public static SingletonTest getInstance(){
        if (instance == null) {
            synchronized (SingletonTest.class){
                if (instance == null){
                    instance = new SingletonTest();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws Exception {
        Class<SingletonTest> singletonTestClass = SingletonTest.class;
        Constructor c0=  singletonTestClass.getDeclaredConstructor();
        c0.setAccessible(true);
        SingletonTest po=(SingletonTest)c0.newInstance();
        System.out.println("无参构造函数\t"+po);
        /*以下调用带参的、私有构造函数*/
        Constructor c1=singletonTestClass.getDeclaredConstructor(new Class[]{String.class});
        c1.setAccessible(true);
        SingletonTest p1=(SingletonTest)c1.newInstance(new Object[]{"我是参数值"});
        System.out.println("有参的构造函数\t"+p1);
    }



}
