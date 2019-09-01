package com.zk.future.ListNode;

/**
 * @Author: zking
 * @Date: 2019/8/30 15:52
 * @Content:
 */
public class ListNode {

    public int val;
    public ListNode next = null;

    ListNode() {
    }

    public ListNode(int val) {
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

   /* @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }*/
}
