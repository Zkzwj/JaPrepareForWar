package com.zk.future.test;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/12 11:04
 * @Content:
 */
public class LianBiaoJianDanFuZhi {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(-1);
        for (int i = 0; i < 4; i++) {
            listNode.add(i);
        }
        System.out.println(listNode);
        ListNode listNode1 = get(listNode);
        System.out.println("\n"+listNode1);
    }


    private static ListNode get(ListNode listNode) {
        if (listNode == null) return listNode;
        ListNode head = listNode;
        ListNode head2 = new ListNode(head.val);
        ListNode ht = head2;
        while (head != null) {
            System.out.println(head2);
            ListNode temp  = head.next;
            head.next = null;
            ht.next = head;
            ht = ht.next;
            head = temp;
        }
        System.out.println(head2);
        return head2.next;
    }
}
