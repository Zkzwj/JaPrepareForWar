package com.zk.test.EqualsAndHashCode;

import java.util.HashMap;

/**
 * @Author: zking
 * @Date: 2019/9/3 13:26
 * @Content: hashCode：是一个native方法，返回的是对象的内存地址，
 * equals：对于基本数据类型，==比较的是两个变量的值。对于引用对象，==比较的是两个对象的地址。
 * 參考：https://www.cnblogs.com/blueskyli/p/9936076.html
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        HashMap<Person, Integer> map = new HashMap<>();
        Person p = new Person("Jack", 22);
        Person p1 = new Person("Jack", 22);

        System.out.println("p的hashCode：" + p.hashCode());
        System.out.println("p1的hashCode：" + p1.hashCode());

        System.out.println(p.equals(p1));
        System.out.println(p == p1);

        map.put(p, 888);
        map.put(p1, 888);
        map.forEach((key, val) -> {
            System.out.println(key);
            System.out.println(val);
        });


    }
}
