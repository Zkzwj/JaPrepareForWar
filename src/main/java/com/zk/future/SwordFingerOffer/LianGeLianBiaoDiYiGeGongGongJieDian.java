package com.zk.future.SwordFingerOffer;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/16 16:20
 * @Content:
 */
public class LianGeLianBiaoDiYiGeGongGongJieDian {

    public static void main(String[] args) {

    }


    private ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2) {
            l1 = l1 == null ? pHead2 : l1.next;
            l2 = l2 == null ? pHead1 : l2.next;
        }
        return l1;
    }
}
