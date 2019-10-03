package com.zk.future.SwordFingerOffer;

import com.zk.future.TreeNode;

/**
 * @Author: zking
 * @Date: 2019/9/9 22:28
 * @Content:
 */
public class ErChaSouSuoShuYuLianBiao {

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


        TreeNode convert = convert(n1);
        System.out.println(convert);
    }


    public static TreeNode convert(TreeNode pRootOfTree) {
        TreeNode root = pRootOfTree;
        if (root == null) {
            return root;
        }
        // 定位左子树链表的头节点
        TreeNode left = convert(root.left);
        TreeNode l = left;
        // 定位左子树链表的尾节点
        while (l != null && l.right != null) {
            l = l.right;
        }
        //3.如果左子树链表不为空，则将当前root节点追加到左子树上
        if (left != null) {
            l.right = root;
            root.left = l;
        }
        //4.如果右子树链表不为空，则将该链表追加的root节点之后。
        TreeNode right = convert(root.right);
        if (right != null) {
            root.right = right;
            right.left = root;
        }
        //5.根据左子树链表是否为空，返回相应的头节点
        if (left != null) {
            return left;
        }
        return root;
    }
}
