/*
package com.zk.future.tree.wanquanerchashu;

import java.util.LinkedList;
import java.util.List;

import static com.zk.future.SwordFingerOffer.ReConstructBinaryTree.reConstructBinaryTree;

*/
/**
 * @Author: zking
 * @Date: 2019/8/29 16:36
 * @Content:
 *//*

public class CountTreeDeepAndNodes {


    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 8, 9, 5, 3, 6, 7};
        int[] in = {8, 4, 9, 2, 5, 1, 6, 3, 7};
        ReConstructBinaryTree.TreeNode treeNode = reConstructBinaryTree(pre, in);
        int count = count(treeNode);
        System.out.println(count);
    }


    */
/**
     * 完全二叉树的最大深度与节点个数，要利用完全二叉树的特性
     * 思路:
     * 1 找到完全二叉树的最左节点，也就是求左子树的深度
     * 2 找到完全二叉树头节点右子树中的最左节点，记录右子树深度
     * 3 如果两个深度相等，说明头节点左子树是一棵满二叉树，使用公式求得长度再加上头节点，然后对于右子树使用递归求解
     * 4 如果左子树深度大于右子树深度，说明右子树是一棵完全二叉树，使用公式求得长度再加上头节点，然后对于左子树使用递归求解
     *
     * @param root
     * @return
     *//*

    public static int count(ReConstructBinaryTree.TreeNode root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        ReConstructBinaryTree.TreeNode cur = root.left;
        int ldepth = 0;
        while (cur != null) {
            ldepth++;
            cur = cur.left;
        }
        cur = root.right;
        int rdepth = 0;
        while (cur != null) {
            rdepth++;
            cur = cur.right;
        }
        if (ldepth == rdepth) {
            count = (int) (Math.pow(2, ldepth) + count(root.right));
        } else {
            count = (int) (Math.pow(2, rdepth) + count(root.right));
        }
        return count;
    }


    public List<Node> createTree(int[] datas) {
        List<Node> nodes = new LinkedList<>();
        int len = datas.length;
        for (int i = 0; i < len; i++) {
            nodes.add(new Node(datas[i]));
        }
        for (int nodeId = 1; nodeId < len / 2; nodeId++) {
            nodes.get(nodeId - 1).leftChild = nodes.get(nodeId * 2 - 1);
            if (nodeId * 2 < len) {
                nodes.get(nodeId - 1).rightChild = nodes.get(nodeId * 2);
            }
        }
        return nodes;
    }


    public static class Node {
        Node leftChild;
        Node rightChild;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }


}
*/
