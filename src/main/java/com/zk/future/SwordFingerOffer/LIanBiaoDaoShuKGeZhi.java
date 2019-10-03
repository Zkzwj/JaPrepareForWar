package com.zk.future.SwordFingerOffer;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/6 20:42
 * @Content:
 */
class LianBiaoDaoShuKGeZhi {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(-1);
        for (int i = 0; i < 8; i++) {
            listNode.add(i);
        }
        System.out.println(listNode);
        getBackK(listNode, 4);
    }

    private static void getK(ListNode listNode, int target) {
        if (listNode == null) {
            return;
        }
        int count = 0;
        ListNode head1 = listNode;
        ListNode head2 = listNode;
        while (head1 != null) {
            head1 = head1.next;
            count++;
            if (target < count) {
                head2 = head2.next;
            }
        }
        if (target > count) {
            System.out.println("输出超过范围值");
            return;
        }
        System.out.println(head2.val);
    }

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode list = head;
        int count = 0;
        while (list != null) {
            count++;
            list = list.next;
        }
        if (count < k) {
            return null;
        }
        ListNode node = head;
        for (int i = 0; i < count - k; i++) {
            node = node.next;
        }
        return node;
    }

    private static void getBackK(ListNode listNode, int target) {
        if (listNode == null) {
            return;
        }
        int count = 0;
        ListNode l1 = listNode;
        ListNode l2 = listNode;
        while (l1 != null) {
            count++;
            l1 = l1.next;
            if (target < count) {
                l2 = l2.next;
            }
        }
        if (target > count) {
            System.out.println("输入有误！");
            return;
        }

        System.out.println(l2);


    }
}
