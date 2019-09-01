package com.zk.future.ListNode;

import java.util.Random;

/**
 * @Author: zking
 * @Date: 2019/8/29 19:24
 * @Content:
 */
public class RandomNumListNode {


    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
        Random random = new Random();
        for (int i = 1; i < 5; i++) {
            int r = random.nextInt(100);
            listNode.add(r);
        }
        System.out.println(listNode);
        int target = 10;
        ListNode t = t(target, listNode);
        System.out.println(t);

    }


    public static ListNode t1(int target, ListNode listNode) {
        if (listNode == null) {
            return listNode;
        }
        ListNode dayu = null;
        ListNode xiaoyu = null;
        ListNode pre = null;
        while (listNode != null) {
            ListNode pNext = listNode.next;
            if (pNext == null) {
                ListNode ln = new ListNode(target);
                xiaoyu.next = ln;
                xiaoyu.next.next = dayu;
                return xiaoyu;
            }
            listNode.next = pre;
            pre = listNode;
            if (pre.val < target) {
                if (xiaoyu == null) {
                    xiaoyu = new ListNode(pre.val);
                } else {
                    xiaoyu.next = pre;
                    pre = null;
                }
                //System.out.println("xiaoyu:"+xiaoyu);
            } else {
                if (dayu == null) {
                    dayu = new ListNode(pre.val);
                } else {
                    dayu.next = pre;
                    pre = null;
                }
                //System.out.println("dayu:"+dayu);
            }
            listNode = pNext;
        }
        return xiaoyu;
    }

    public static ListNode t(int target, ListNode listNode) {
        if (listNode == null) {
            return listNode;
        }
        ListNode more = new ListNode(-1);
        ListNode moreHead = more;
        ListNode less = new ListNode(-1);
        ListNode lessHead = less;
        while (listNode != null){
            if (listNode.val < target){
                less.next = listNode;
                less = less.next;
            }else {
                more.next = listNode;
                more = more.next;
            }
            listNode = listNode.next;
        }
        more.next = null;  //这步不要忘记，不然链表就出现环了
        less.next = moreHead.next;
        return lessHead.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        public void add(int data) {
            ListNode listNode = new ListNode(data);
            if (this.next == null) {
                this.next = listNode;
            } else {
                this.next.add(data);
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
