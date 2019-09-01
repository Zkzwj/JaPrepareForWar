package com.zk.interview.yuanfudao;

import com.zk.future.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author: zking
 * @Date: 2019/9/1 12:38
 * @Content:
 */
public class ZhiZiPrint {

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
        System.out.println(print(n1));
    }

    public static ArrayList<ArrayList<Integer>> print(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> ll = new LinkedList<>();
        ll.add(null);
        ll.add(root);
        boolean leftToRight = true;
        while (ll.size() != 1) {
            TreeNode temp = ll.removeFirst();
            if (temp == null) {
                Iterator<TreeNode> iter = null;
                if (leftToRight){
                    iter = ll.iterator();
                }else {
                    iter = ll.descendingIterator();
                }
                while(iter.hasNext()){
                    TreeNode node = iter.next();
                    list.add(node.val);
                }
                leftToRight = !leftToRight;
                res.add(new ArrayList<>(list));
                list.clear();
                ll.add(null);
                continue;
            }
            if (temp.left != null){
                ll.add(temp.left);
            }
            if (temp.right != null) {
                ll.add(temp.right);
            }
        }
        return res;
    }

}
