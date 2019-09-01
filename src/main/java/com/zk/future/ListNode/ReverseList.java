package com.zk.future.ListNode;

/**
 * @Author: zking
 * @Date: 2019/8/29 19:05
 * @Content:
 */
public class ReverseList {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(-1);
        for (int i = 0; i < 8; i++) {
            listNode.add(i);
        }
        ListNode re = re(listNode);
        System.out.println(re);
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
