package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/25 21:25
 * @Content:
 */
public class MergeLinkNode {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                list1.add(i);
            } else {
                list2.add(i);
            }
        }
        ListNode merge = merge(list1, list2);
        System.out.println(merge.hashCode());
        System.out.println(merge);

    }


    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode list = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = list1;
                list1 = list2.next;
            } else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            head.next = list1;
        }
        if (list2 != null) {
            head.next = list2;
        }
        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        public void add(int i) {
            ListNode listNode = new ListNode(i);
            if (this.next == null) {
                this.next = listNode;
            } else {
                this.next.add(i);
            }
        }

        @Override
        public int hashCode() {
            int hash = 1;
            hash = hash * 17 + val;
            hash = hash * 31 + next.hashCode();
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (obj instanceof ListNode) {
                ListNode listNode = (ListNode) obj;
                return listNode.next.equals(listNode) && listNode.val == val;
            }
            return false;
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
