package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/11 14:37
 * @Content:  复杂链表赋值
 */
public class FuZaLianBiao {

    public static void main(String[] args) {

        RandomListNode r = new RandomListNode(0);
        r.next = new RandomListNode(1);
        r.next.next = new RandomListNode(2);
        r.next.next.next = new RandomListNode(3);
        RandomListNode clone = Clone(r);
        System.out.println(clone);
    }

    public static RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return pHead;
        RandomListNode pointer = pHead; // 正常指针
        RandomListNode randomListNode = pHead; // 任意指针
        // 对正常指针进行处理
        while (pointer != null) {
            RandomListNode temp = new RandomListNode(pointer.label);
            temp.next = pointer.next;
            pointer.next = temp;
            pointer = temp.next;
        }
        while (randomListNode != null) {
            RandomListNode q = randomListNode.next;
            if (randomListNode.random != null)
                q.random = randomListNode.random.next;
            randomListNode = q.next;
        }
        RandomListNode s = new RandomListNode(0);
        RandomListNode s1 = s;
        while (pHead != null) {
            RandomListNode q = pHead.next;
            pHead.next = q.next;
            q.next = s.next;
            s.next = q;
            s = s.next;
            pHead = pHead.next;
        }
        return s1.next;
    }

    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return "RandomListNode{" +
                    "label=" + label +
                    ", next=" + next +
                    ", random=" + random +
                    '}';
        }
    }
}
