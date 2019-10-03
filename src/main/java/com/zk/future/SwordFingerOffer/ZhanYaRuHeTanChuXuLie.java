package com.zk.future.SwordFingerOffer;

import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/9/6 22:02
 * @Content:
 */
public class ZhanYaRuHeTanChuXuLie {


    public static void main(String[] args) {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {1, 2, 3, 4, 5};
        boolean popOrder = isPopOrder(pushA, popA);
        System.out.println(popOrder);
    }

    public static boolean isPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0) {
            return false;
        }
        int i = 0, j = 0;
        while (j < popA.length) {
            while (stack.isEmpty() || stack.peek() != popA[j]) {
                if (i == pushA.length) {
                    return false;
                }
                stack.push(pushA[i++]);
            }
            Integer pop = stack.pop();
            System.out.print(pop+" ");
            j++;
        }
        return true;
    }



    public static boolean isPopOrder1(int[] pushA, int[] popA) {
       Stack<Integer> stack = new Stack<>();
        if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0) {
            return false;
        }
       int i = 0, j = 0;
       while (j < popA.length){
           while (stack.isEmpty() || stack.peek() != popA[j]){
                   if (i == pushA.length){
                       return false;
                   }
                   stack.push(pushA[j]);
           }
           stack.pop();
           j++;
       }
       return true;
    }
}
