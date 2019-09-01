package com.zk.future.ListNode;

/**
 * @Author: zking
 * @Date: 2019/8/29 18:24
 * @Content:
 */
public class MergeListNode {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(-1);
        ListNode listNode1 = new ListNode();
        for (int i = 1; i < 8; i++) {
            if (i % 2 == 0) {
                listNode.add(i);
            } else {
                listNode1.add(i);
            }
        }
        ListNode merge = merge(listNode, listNode1);
        System.out.println(merge);
    }


    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(-1);
        listNode.next = null;
        ListNode list = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                listNode.next = l1;
                listNode = l1;
                l1 = l1.next;
            } else {
                listNode.next = l2;
                listNode = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            listNode.next = l1;
        }
        if (l2 != null) {
            listNode.next = l2;
        }
        return list.next;
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
