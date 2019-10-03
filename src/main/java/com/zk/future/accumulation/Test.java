package com.zk.future.accumulation;

import com.zk.future.ListNode.ListNode;
import com.zk.future.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zking
 * @Date: 2019/9/10 22:41
 * @Content:
 */
public class Test {

    public static void main(String[] args) {

        String dtr = "";
        //dtr.replace()

        ListNode listNode = new ListNode(-1);
        ListNode listNode1 = new ListNode(-1);
        ListNode listNode2 = new ListNode(-1);
        for (int i = 0; i < 3; i++) {
            listNode.add(i);
            listNode1.add(i);
            listNode2.add(i);
        }
        ListNode all = getAll(listNode1, listNode2);
        System.out.println(all);
    }

    private static ListNode getAll(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode preHead = head;
        while (l1!= null && l2!= null){
            if (l1.val <= l2.val) {
                preHead.next = l1;
                l1 = l1.next;
            }else {
                preHead.next = l2;
                l2 = l2.next;
            }
            preHead = preHead.next;
        }
        preHead.next = l1 == null ? l2 :l1;
        return head.next;
    }
}
