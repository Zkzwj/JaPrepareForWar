package com.zk.future.SwordFingerOffer;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/6 21:20
 * @Content:
 */
public class HeBingLiangGeLianBiao {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(-1);
        ListNode listNode1 = new ListNode(-2);
        for (int i = 0; i < 8; i++) {
            listNode.add(i);
        }
        for (int i = 8; i < 16; i++) {
            listNode1.add(i);
        }
        System.out.println(listNode);
        System.out.println(listNode1);
        ListNode merge = Merge(listNode, listNode1);
        System.out.println(merge);
    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode preHead = head;
        while (list1!= null && list2!= null){
            if (list1.val <= list2.val) {
                preHead.next = list1;
                list1 = list1.next;
            }else {
                preHead.next = list2;
                list2 = list2.next;
            }
            preHead = preHead.next;
        }
        preHead.next = list1 == null ? list2 :list1;
        return head.next;
    }


}
