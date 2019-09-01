package com.zk.future.ListNode;

import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/8/29 21:14
 * @Content:
 */
public class huiwenListNode {
    private static class ListNode {
        private ListNode next;
        int value;

        public ListNode(int value) {
            super();
            this.value = value;
        }


        public static void main(String[] args) {
            ListNode node = new ListNode(1);
            node.next = new ListNode(2);
            node.next.next = new ListNode(3);
            node.next.next.next = new ListNode(2);
            node.next.next.next.next = new ListNode(1);
            node.next.next.next.next.next = new ListNode(5);
            ListNode p = node;
            while (p != null) {
                System.out.print(p.value + " ");
                p = p.next;
            }
            System.out.print("\n");
            boolean res = plalinDromeLinkedList(node);
            System.out.println(res);
            System.out.println(isPalindrome(node));
        }

        public static boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;                 //空链表和一个节点的链表都是回文链表
            }
            int count = 0;
            ListNode start = head;
            while (start != null) {              //遍历链表得到链表节点个数
                count++;
                start = start.next;
            }
            if (count == 2) {                     //只有两个节点的情况
                if (head.value == head.next.value) {
                    return true;
                }
                return false;
            }
            int ret = count / 2;
            start = head;
            ListNode temp = head.next;
            head.next = null;
            for (int i = 1; i < ret; i++) {    //至少四个节点     //逆置前一半的链表
                head = temp;
                temp = temp.next;
                head.next = start;
                start = head;
            }
            if (count % 2 == 1) {
                temp = temp.next;
            }
            while (temp != null) {               //节点比较
                if (temp.value != head.value) {
                    return false;
                }
                temp = temp.next;
                head = head.next;
            }

            return true;

        }

        private static boolean plalinDromeLinkedList(ListNode node) {
            //有两种方法可以解决一种是翻转链表进行比较,另外一种是将链表前半部分进行压栈然后进行弹栈与后半部分的节点进行比较
            //所以要使用到一种数据结构就是栈
            ListNode slow = node;
            ListNode fast = node;
            boolean isOdd = true;
            Stack<Integer> stack = new Stack<>();
            while (fast != null && fast.next != null) {
                //快的一次走两步,慢的一次走一步那么最后快的结束了慢的走了一半,此时在走的过程中需要压栈
                stack.push(slow.value);
                slow = slow.next;
                fast = fast.next.next;
                if (fast == null) {
                    isOdd = false;
                }
            }
            //假如是奇数慢指针需要再走一步
            if (isOdd) slow = slow.next;
            while (!stack.isEmpty()) {
                //出栈
                if (stack.pop() != slow.value) {
                    return false;
                }
                slow = slow.next;
            }
            return true;
        }
    }

}

