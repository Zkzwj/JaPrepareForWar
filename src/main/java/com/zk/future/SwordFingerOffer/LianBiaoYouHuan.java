package com.zk.future.SwordFingerOffer;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/12 19:07
 * @Content: 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class LianBiaoYouHuan {


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n2;
        ListNode listNode = new LianBiaoYouHuan().EntryNodeOfLoop(n1);
        System.out.println("入口点："+listNode.val);
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                ListNode temp = pHead;
                if (temp == fast){
                    return fast;
                }
                while (true){
                    temp = temp.next;
                    fast = fast.next;
                    if (temp == fast){
                        break;
                    }
                }
                return fast;
            }
        }
        return null;
    }
}
