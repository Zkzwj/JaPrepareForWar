package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/24 19:58
 * @Content:
 */
public class FindKthToTail {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        for (int i=1; i<10; i++){
            listNode.add(i);
        }
        System.out.println(listNode);
        ListNode kthToTail = findKthToTail(listNode, 7);
        System.out.println(kthToTail);
    }

    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     */
    private static ListNode findKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode list = head;
        int count = 0;
        while(list != null){
            count++;
            list = list.next;
        }
        if (count<k) {
            return null;
        }
        ListNode node = head;
        for (int i = 0; i < count-k; i++) {
            node = node.next;
        }
        return node;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        //添加结点
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
