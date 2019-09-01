package com.zk.interview.yuanfudao;

import com.zk.future.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: zking
 * @Date: 2019/9/1 11:02
 * @Content:
 */
public class ErChaTreeDepth {

    public static void levelOrder(TreeNode root) {
        if (root == null) {
            System.out.println(0);
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int len = 0;
        while (!q.isEmpty()) {
            int count = q.size();
            len++;
            while (count > 0) {
                TreeNode temp = q.peek();//peek() 用于在队列的头部查询元素
                q.poll();//删除队列中的第一个元素
                //list.add(temp.val);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                count--;
            }
        }
        System.out.println(len);
    }


    public static int  getMaxDepth(TreeNode root){
        if (root == null){
            System.out.println(0);
            return 0;
        }else {
            int left = getMaxDepth(root.left);
            int rigth = getMaxDepth(root.right);
            int dep = 1 + Math.max(left, rigth);
            return dep;
        }

    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.right = n8;

        //levelIterator(n1);
        levelOrder(n1);
        System.out.println(n1);
        //getMaxDepth(n1);
        //System.out.println();

    }

}
