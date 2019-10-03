package com.zk.future;


import com.zk.future.ListNode.ListNode;

public class LinkedList {

    //O(1)时间删除链表节点，从无头单链表中删除节点
    void deleteRandomNode(ListNode cur) {
        assert (cur != null);
        assert (cur.next != null);    //不能是尾节点
        ListNode pNext = cur.next;
        cur.val = pNext.val;
        cur.next = pNext.next;
        //delete pNext;
    }

    //单链表的转置,循环方法
    ListNode reverseByLoop(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;

            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    ListNode rV(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newData = null;
        ListNode pre = null;
        while (head != null) {
            ListNode pN = head.next;
            if (pN == null) {
                newData = head;
            }
            head.next = pre;
            pre = head;
            head = pN;
        }
        return newData;
    }

    //单链表的转置,递归方法
    ListNode reverseByRecursion(ListNode head) {
        //第一个条件是判断异常，第二个条件是结束判断
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverseByRecursion(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;    //返回新链表的头指针
    }

    //倒数第k个节点
    ListNode theKthNode(ListNode head, int k) {
        if (k < 0) return null;    //异常判断

        ListNode slow, fast;
        slow = fast = head;
        int i = k;
        for (; i > 0 && fast != null; i--) {
            fast = fast.next;
        }

        if (i > 0) return null;    //考虑k大于链表长度的case

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    //求链表的中间节点
    ListNode theMiddleNode(ListNode head) {
        if (head == null)
            return null;
        ListNode slow, fast;
        slow = fast = head;
        //如果要求在链表长度为偶数的情况下，返回中间两个节点的第一个，可以用下面的循环条件
        //while(fast && fast.next != null && fast.next.next != null)
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    //判断单链表是否存在环,参数circleNode是环内节点，后面的题目会用到
    boolean hasCircle(ListNode head, ListNode circleNode) {
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                circleNode = fast;
                return true;
            }
        }

        return false;
    }

    //找到环的入口点
    ListNode findLoopPort(ListNode head) {
        //如果head为空，或者为单结点，则不存在环
        if (head == null || head.next == null) return null;

        ListNode slow, fast;
        slow = fast = head;

        //先判断是否存在环
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }

        if (fast != slow) return null;    //不存在环

        fast = head;                //快指针从头开始走，步长变为1
        while (fast != slow) {           //两者相遇即为入口点
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }


    //判断两个链表是否相交
    boolean isIntersect(ListNode h1, ListNode h2) {
        if (h1 == null || h2 == null) return false;    //异常判断
        while (h1.next != null) {
            h1 = h1.next;
        }

        while (h2.next != null) {
            h2 = h2.next;
        }

        if (h1 == h2) return true;        //尾节点是否相同
        else return false;
    }

    //判断两个带环链表是否相交
    boolean isIntersectWithLoop(ListNode h1, ListNode h2) {
        ListNode circleNode1 = null, circleNode2 = null;
        if (!hasCircle(h1, circleNode1))    //判断链表带不带环，并保存环内节点
            return false;                //不带环，异常退出
        if (!hasCircle(h2, circleNode2))
            return false;

        ListNode temp = circleNode2.next;
        while (temp != circleNode2) {
            if (temp == circleNode1)
                return true;
            temp = temp.next;
        }
        return false;
    }

    //求两链表相交的第一个公共节点
    ListNode findIntersectNode(ListNode h1, ListNode h2) {
        int len1 = listLength(h1);          //求链表长度
        int len2 = listLength(h2);
        //对齐两个链表
        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++)
                h1 = h1.next;
        } else {
            for (int i = 0; i < len2 - len1; i++)
                h2 = h2.next;
        }
        while (h1 != null) {
            if (h1 == h2)
                return h1;
            h1 = h1.next;
            h2 = h2.next;
        }
        return null;
    }

    private int listLength(ListNode h1) {
        return 0;
    }
}
