package com.zk.interview.yuanfudao;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author: zking
 * @Date: 2019/9/1 16:30
 * @Content: 一个数组实现两个栈
 */
public class ShuZuShiXianLiangGeZhan {

    private Object[] stack;
    // 栈1在数组中的下标
    private int size1;
    // 栈2在数组中的下标
    private int size2;

    // 初始化数组大小
    public ShuZuShiXianLiangGeZhan(int length) {
        stack = new Object[length];
        size1 = 0;
        size2 = length - 1;
    }

    // 栈1 的元素个数
    public int size1() {
        return size1;
    }

    // 栈2 的元素个数
    public int size2() {
        return capacity() - size1;
    }

    // 栈1 是否為空
    public boolean isEmpty() {
        return size1 == 0;
    }

    // 栈1 是否爲空
    public boolean isEmpty2() {
        return capacity() - size1 == 0;
    }

    // 数组长度
    public int capacity() {
        return stack.length;
    }

    // 数组扩容
    public void ensureCapacity() {
        if ((size1() + size2()) > capacity()) {
            Object[] newStack = new Object[capacity() * 2];
            int k = newStack.length - 1;
            for (int i = 0; i < size1(); i++) {
                newStack[i] = stack[i];
            }
            for (int j = capacity(); j >= 0; j++) {
                newStack[k] = stack[j];
                k--;
            }
            size2 = newStack.length - (capacity() - size2());
            stack = newStack;
        }
    }

    // 栈1 入栈
    public void push1(Object obj) {
        ensureCapacity();
        stack[size1] = obj;
        size1++;
    }

    // 栈2 入栈
    public void push2(Object obj) {
        ensureCapacity();
        stack[size2] = obj;
        size2--;
    }

    // 栈1 出栈
    public Object pop1() {
        if (isEmpty()) {
            System.out.println("null");
        }
        Object obj = stack[--size1];
        stack[size1] = null;
        return obj;
    }

    // 栈2 出栈
    public Object pop2() {
        if (isEmpty2()) {
            throw new ArrayIndexOutOfBoundsException("不能為空");
        }
        Object obj = stack[++size2];
        stack[size2] = null;
        return obj;
    }


}
