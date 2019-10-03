package com.zk.future.SwordFingerOffer;

import com.zk.future.TreeNode;

/**
 * @Author: zking
 * @Date: 2019/9/16 17:03
 * @Content:
 */
public class ShiFouShiPingHengErChaShu {

    public static void main(String[] args) {
        ShiFouShiPingHengErChaShu s = new ShiFouShiPingHengErChaShu();
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
        boolean b = s.IsBalanced_Solution(n1);
        System.out.println(b);

    }

    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }

    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        if (left == -1) return -1;
        int right = getDepth(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }
}
