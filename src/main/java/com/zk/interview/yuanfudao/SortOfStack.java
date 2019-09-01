package com.zk.interview.yuanfudao;

import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/8/30 16:18
 * @Content: 栈排序
 */
public class SortOfStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        System.out.println(stack);
        sortStackByStack(stack);
        System.out.println(stack);
    }

    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }

}
