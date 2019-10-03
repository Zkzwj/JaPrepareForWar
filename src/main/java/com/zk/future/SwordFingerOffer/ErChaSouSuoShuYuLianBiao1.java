package com.zk.future.SwordFingerOffer;

import com.zk.future.TreeNode;

/**
 * @Author: zking
 * @Date: 2019/9/12 15:35
 * @Content:
 */
public class ErChaSouSuoShuYuLianBiao1 {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(1);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n5;

        n2.left = n3;
        n2.right = n4;

        Convert(n1);
    }

    public static TreeNode lefthead = null;
    public static TreeNode righthead = null;
    public static TreeNode Convert(TreeNode root) {
        if(root==null) {
            return null;
        }
        Convert(root.left);
        if(righthead==null) {
            lefthead = righthead = root;
        }else {
            righthead.right = root;
            root.left = righthead;
            righthead = root;
        }
        Convert(root.right);
        return lefthead;

    }
}
