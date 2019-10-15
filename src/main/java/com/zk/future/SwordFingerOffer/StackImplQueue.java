package com.zk.future.SwordFingerOffer;

import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/9/6 17:25
 * @Content:
 */
public class StackImplQueue {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
           stack1.push(i);
        }
        Integer pop = stack1.pop();
        System.out.println(pop);
    }


    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if (stack2.size() <= 0){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


}
