package com.zk.future;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class LevelPrint {

    public static ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(null);
        queue.add(root);
        boolean leftToright = true;
        while (queue.size() != 1) {
            TreeNode node = queue.removeFirst();
            if (node == null) {
                Iterator<TreeNode> iter = null;
                if (leftToright) {
                    iter = queue.iterator();
                } else {
                    iter = queue.descendingIterator();
                }
                leftToright = !leftToright;
                while (iter.hasNext()) {
                    TreeNode temp = iter.next();
                    list.add(temp.val);
                }
                ret.add(new ArrayList<Integer>(list));
                list.clear();
                queue.add(null);
                continue;
            }
            if (node.left != null) {
                queue.addLast(node.left);
            }
            if (node.right != null) {
                queue.addLast(node.right);
            }
        }
        return ret;
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
        System.out.println(Print(n1));
    }
}
