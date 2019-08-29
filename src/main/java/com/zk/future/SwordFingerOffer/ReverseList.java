package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/24 20:23
 * @Content:
 */
public class ReverseList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        for (int i = 1; i < 10; i++) {
            listNode.add(i);
        }
        System.out.println(listNode);
        ListNode listNode1 = reverseList(listNode);
        System.out.println(listNode1);
    }

    /**
     * 输入一个链表，反转链表后，输出新链表的表头。
     */
    private static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newNode = null;
        ListNode list = head;
        ListNode pPrev = null;
        while (list != null) {
            ListNode pNext = list.next;
            if (pNext == null) {
                newNode = list;
            }
            // 始终保持pPrev为null
            list.next = pPrev;
            pPrev = list;
            list = pNext;
        }
        System.out.println(newNode);
        return newNode;
    }


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public void add(int newdata) {
            ListNode newNode = new ListNode(newdata);    //创建一个结点
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.add(newdata);
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
