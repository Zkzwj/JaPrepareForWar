package com.zk.interview.tigger;


/**
 * @Author: zking
 * @Date: 2019/8/23 18:50
 * @Content:
 */
public class One {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);  //设置结果
        if (lists == null || lists.length < 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        } else if (lists.length == 2) {
            mergeTwoLists(lists[0], lists[1]);
        } else {
            res = mergeTwoLists(lists[0], lists[1]);
            for (int i = 2; i < lists.length; i++) {
                mergeTwoLists(res, lists[i]);
            }
        }
        return res;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tmp = res;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        //后面是为了补全的，因为链表的长度可能不一样
        if (l1 != null) {
            tmp.next = l1;
        } else {
            tmp.next = l2;
        }
        return res.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

}
