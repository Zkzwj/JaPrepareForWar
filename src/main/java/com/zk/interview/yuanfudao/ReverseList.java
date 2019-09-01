package com.zk.interview.yuanfudao;

/**
 * @Author: zking
 * @Date: 2019/8/29 19:05
 * @Content:
 */
public class ReverseList {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(-1);
        ListNode listNode1 = new ListNode(-1);
        ListNode listNode2 = new ListNode(-1);
        for (int i = 0; i < 8; i++) {
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

    public static ListNode re(ListNode listNode) {
        if (listNode == null) {
            return listNode;
        }
        ListNode newNode = null;
        ListNode list = listNode;
        ListNode pre = null;
        while (list != null) {
            ListNode pNext = list.next;
            if (pNext == null) {
                newNode = list;
            }
            list.next = pre;
            pre = list;
            list = pNext;
        }
        return newNode;
    }

    public static ListNode re1(ListNode listNode) {
        if (listNode == null) return listNode;
        ListNode newData = null;
        ListNode list = listNode;
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

    public static ListNode reversByRe(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode listNode = reversByRe(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public void add(int newData) {
            ListNode newNode = new ListNode(newData);
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.add(newData);
            }
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
