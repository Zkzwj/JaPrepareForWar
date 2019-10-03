package com.zk.future.SwordFingerOffer;

import com.zk.future.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: zking
 * @Date: 2019/9/16 16:54
 * @Content: 求给定二叉树的深度
 */
public class ErChaShuShenDu {

    public static void main(String[] args) {
        ErChaShuShenDu e = new ErChaShuShenDu();
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
        int i = e.TreeDepth(n1);
        System.out.println(i);

    }

    private int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);// 使用队列
        int dep = 0;
        while (!q.isEmpty()){
            int count = q.size(); // 获取当前队列的大小
            dep++;
            while (count > 0){// 出口条件
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                count--;
            }
        }
        return dep;
    }
}
