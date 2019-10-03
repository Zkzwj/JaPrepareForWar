package com.zk.future.leetcode;

import com.zk.future.ListNode.ListNode;

import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/9/3 15:56
 * @Content:
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node11 = new ListNode(4);
        ListNode node12 = new ListNode(3);
        node1.next = node11;
        node11.next = node12;
        ListNode node2 = new ListNode(5);
        ListNode node21 = new ListNode(6);
        ListNode node22 = new ListNode(4);
        node2.next = node21;
        node21.next = node22;

        getAll(node1, node2);
    }


    private static void getAll(ListNode l1, ListNode l2){
       ListNode pre = new ListNode(0);
       ListNode cur = pre;
       int carry = 0;
       while (l1 != null || l2 != null){
           int x = l1 == null ? 0 : l1.val;
           int y = l2 == null ? 0 : l2.val;
           int sum = x + y + carry;

           carry = sum / 10;
           sum = sum % 10;
           cur.next = new ListNode(sum);
           cur = cur.next;

           if (l1 != null){
               l1 = l1.next;
           }
           if (l2 != null){
               l2 = l2.next;
           }
           if (carry == 1){
               cur.next = new ListNode(carry);
           }
           System.out.println(pre.next);
       }
    }
}
