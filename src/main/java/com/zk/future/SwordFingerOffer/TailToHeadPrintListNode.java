package com.zk.future.SwordFingerOffer;

import com.zk.future.ListNode.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/9/6 17:01
 * @Content:
 */
public class TailToHeadPrintListNode {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(0);
        for (int i = 1; i < 4; i++){
            listNode.next = new ListNode(i);
        }
        ArrayList<Integer> arrayList = tailToHead(listNode);
        System.out.println(arrayList);

    }

    private static ArrayList<Integer> tailToHead(ListNode listNode){
        if (listNode == null){
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
