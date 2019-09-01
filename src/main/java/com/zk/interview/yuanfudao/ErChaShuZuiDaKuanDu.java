package com.zk.interview.yuanfudao;

import com.zk.future.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: zking
 * @Date: 2019/9/1 17:01
 * @Content: 二叉树的最大宽度
 */
public class ErChaShuZuiDaKuanDu {

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);
        TreeNode n12 = new TreeNode(12);
        TreeNode n13 = new TreeNode(13);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.left = n8;
        n4.right = n9;
        n5.left = n10;
        n5.right = n11;
        n6.left = n12;
        n6.right = n13;

        int maxWidth = getMaxWidth(n1);
        System.out.println(maxWidth);
    }
    // 在上一层遍历完成后，下一层的所有节点已经放到队列中，此时队列中的元素个数就是下一层的宽度
    public static int getMaxWidth(TreeNode root){
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        int maxWitdth = 1; // 最大宽度
        queue.add(root);// 入队
        while (true) {
            int len = queue.size();
            if (len == 0) {
                break;
            }
            while (len > 0){
                TreeNode t = queue.poll();
                len--;
                if (t.left != null){
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
                maxWitdth = Math.max(maxWitdth, queue.size());
            }
        }
        return maxWitdth;
    }
}
