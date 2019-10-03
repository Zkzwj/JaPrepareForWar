package com.zk.future.ListNode;

/**
 * @Author: zking
 * @Date: 2019/9/1 21:37
 * @Content:
 */
public class LianBiaoJiOuChaiFen {

    public static void main(String[] args) {
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

        getL(n1);
    }

    private static void getL(ListNode root) {
        ListNode jiShu = null;
        ListNode ouShu = null;
        ListNode q = null, r = null, p;
        while (root != null) {
            p = root;
            if (root.val % 2 != 0) {
                if (jiShu == null) {
                    jiShu = p;
                    q = jiShu;
                }
                root = root.next;
                q.next = p;
                q = p;
                q.next = null;

            } else {
                if (ouShu == null) {
                    ouShu = p;
                    r = ouShu;
                }
                root = root.next;
                r.next = p;
                r = p;
                r.next = null;

            }
        }
        System.out.println(jiShu);
        System.out.println(ouShu);
    }
}
