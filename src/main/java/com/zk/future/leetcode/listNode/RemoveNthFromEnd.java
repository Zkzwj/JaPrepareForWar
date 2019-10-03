package com.zk.future.leetcode.listNode;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/15 18:47
 * @Content:
 */
public class RemoveNthFromEnd {


    public static void main(String[] args) {
        RemoveNthFromEnd r = new RemoveNthFromEnd();
        ListNode listNode = new ListNode(1);
        for (int i = 2; i < 8; i++) {
            listNode.add(i);
        }
        ListNode res = r.findNthFromEnd(listNode, 2);
        System.out.println(res);
        ListNode listNode1 = r.removeNthFromEnd(listNode, 2);
        System.out.println(listNode1);
    }

    public ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while (fast != null) {
            fast = fast.next;
            count++;
            if (n < count) {
                slow = slow.next;
            }
        }
        if (n > count) {
            return null;
        }
        return slow;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
