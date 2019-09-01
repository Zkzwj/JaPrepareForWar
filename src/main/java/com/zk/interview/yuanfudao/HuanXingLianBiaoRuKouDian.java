package com.zk.interview.yuanfudao;

import com.zk.future.ListNode.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/1 14:10
 * @Content:
 */
public class HuanXingLianBiaoRuKouDian {

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
        System.out.println("原始："+n1);
        HuanXingLianBiaoRuKouDian t = new HuanXingLianBiaoRuKouDian();
        ListNode listNode = t.detectCycle(n1);
        System.out.println("入口点："+listNode.val);
    }

    public ListNode detectCycle(ListNode head) {
        if((head == null) || (head.next == null)){
            return null;
        }
        //使用快慢指针，若有环，相遇，否则无环
        ListNode fast = head;
        ListNode slow = head;
        while((fast != null) && (fast.next != null)){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //有环
                //记住相遇点的指针，一个从相遇点开始，一个从头开始，相遇的地方就是环的入口点
                ListNode tmp = head;
                //假设链表的开始就是入口点
                //如果链表的开始是入口点，最后一定在开始的位置相遇
                //因为fast是slow的两倍，当fast走了一圈的时候,slow走半圈，最后在fast走两圈，slow走一圈的位置相遇
                if(tmp == fast){
                    return fast;
                }
                while(true){
                    fast = fast.next;
                    tmp = tmp.next;
                    if(fast == tmp){
                        break;
                    }
                }
                return fast;
            }
        }
        return null;
    }
}
