package com.zk.interview.yuanfudao;

import com.zk.future.ListNode.ListNode;

import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/8/31 15:09
 * @Content: 回文链表
 */
public class IsPalindrome {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(-1);
        listNode.add(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(42);
        System.out.println(isP(listNode));
    }

    /**
     * idea：只要找到链表的中间位置，以中间位置为分界线，反转前半部分， 再用反转了的前半部分与后半部分做对比，如有不同则返回false
     */
    public static boolean isP(ListNode head){
        if (head == null || head.next == null){
            return true;
        }
        // 快慢指针找到链表的中点
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // 翻转链表前半部分
        ListNode pre = null;
        ListNode next = null;
        while(head != slow){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        // 如果是奇数个结点，去掉后半部分第一个节点
        if (fast != null){
            slow = slow.next;
        }
        // 回文校验
        while(pre != null){
            if (pre.val != slow.val){
                return false;
            }
            pre = pre.next;
            slow = slow.next;
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
            stack.push(slow.val);
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
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

}
