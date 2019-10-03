package com.zk.future.SwordFingerOffer;

import com.zk.future.TreeNode;

/**
 * @Author: zking
 * @Date: 2019/9/6 21:32
 * @Content:
 */
public class ZiShuWenTi {

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(11);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        n4.right = n8;
        boolean b = HasSubtree(n1, n9);
        System.out.println(b);
    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null){
            return false;
        }
        return isSubTree(root1, root2)|| HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private static boolean isSubTree(TreeNode root1, TreeNode root2){
        if (root2 == null)
            return  true;
        if (root1 == null)
            return false;
        if (root1.val == root2.val){
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }else {
            return false;
        }
    }


}
