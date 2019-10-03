package com.zk.future.SwordFingerOffer;

import java.util.Iterator;
import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/9/9 21:29
 * @Content:
 */
public class MinStack {

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {

    }


    private static void push(int node) {
        stack.push(node);
    }

    public static int pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return -1;
    }

    public static int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }

    public static int min() {
        Stack<Integer> st = stack;
        int min = st.peek();
        int temp = 0;
        Iterator<Integer> iter = st.iterator();
        while (iter.hasNext()){
            temp = iter.next();
            if (min > temp){
                min = temp;
            }
        }
        return min;
    }

}
