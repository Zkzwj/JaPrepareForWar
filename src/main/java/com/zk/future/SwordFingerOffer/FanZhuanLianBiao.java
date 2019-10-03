package com.zk.future.SwordFingerOffer;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/6 21:13
 * @Content:
 */
public class FanZhuanLianBiao {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(-1);
        ListNode listNode1 = new ListNode(-1);
        ListNode listNode2 = new ListNode(-1);
        for (int i = 0; i < 4; i++) {
            listNode.add(i);
            listNode1.add(i);
            listNode2.add(i);
        }
        ListNode re = re(listNode);
        System.out.println(re);
        ListNode re1 = re1(listNode1);
        System.out.println(re1);
        ListNode re2 = reversByRe(listNode2);
        System.out.println(re2);
    }


    private static ListNode re(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode newData = null;
        ListNode list = head;
        ListNode pre = null;
        while (list != null) {
            ListNode pN = list.next;
            if (pN == null) {
                newData = list;
            }
            list.next = pre;
            pre = list;
            list = pN;
        }
        return newData;
    }

    private static ListNode re1(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newData = null;
        ListNode list = head;
        ListNode pre = null;
        while (list != null) {
            ListNode pN = list.next;
            if (pN == null) {
                newData = list;
            }
            list.next = pre;
            pre = list;
            list = pN;
        }
        return newData;
    }

    private static ListNode reversByRe(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode listNode = reversByRe(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }
}
