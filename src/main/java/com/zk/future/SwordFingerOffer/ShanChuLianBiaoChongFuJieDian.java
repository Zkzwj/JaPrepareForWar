package com.zk.future.SwordFingerOffer;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/12 19:14
 * @Content:
 */
public class ShanChuLianBiaoChongFuJieDian {


    public static void main(String[] args) {
        ShanChuLianBiaoChongFuJieDian s = new ShanChuLianBiaoChongFuJieDian();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        ListNode listNode = s.deleteDuplication(n1);
        System.out.println(listNode);
    }

    // 非递归
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode res = new ListNode(-1);
        ListNode node = res;
        while (pHead != null) {
            boolean dup = false;
            while (pHead != null && pHead.next != null && pHead.val == pHead.next.val) {
                pHead = pHead.next;
                dup = true;
            }
            if (!dup) {
                res.next = pHead;
                res = res.next;
            }
            pHead = pHead.next;
        }
        res.next = null;//防止res后面还有重复的节点
        return node.next;
    }
    // 递归
    public ListNode deleteDuplication1(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        if (pHead.next != null && pHead.val == pHead.next.val){
            while (pHead != null && pHead.next != null && pHead.val == pHead.next.val){
                pHead = pHead.next;
            }
            return deleteDuplication1(pHead.next);
        }else {
            pHead.next = deleteDuplication1(pHead.next);
        }
        return pHead;
    }
}
