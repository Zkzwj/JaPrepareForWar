package com.zk.future.SwordFingerOffer;

import com.zk.future.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author: zking
 * @Date: 2019/9/11 11:26
 * @Content:
 */
public class ShangDaoXiaDaYinErChaShu {

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
        ArrayList<Integer> arrayList = PrintFromTopToBottom(n1);
        System.out.println(arrayList);
    }


    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        LinkedList<TreeNode> l1 = new LinkedList<>();
        l1.add(null);
        l1.add(root);
        boolean flag = true;
        while (l1.size() != 1){
            TreeNode temp = l1.removeFirst();
            if (temp == null){
                Iterator<TreeNode> iterator = null;
                if (flag){
                    iterator = l1.iterator();
                }else {
                    iterator = l1.descendingIterator();
                }
                while (iterator.hasNext()){
                    TreeNode next = iterator.next();
                    list.add(next.val);
                }
                flag = !flag;
                l1.add(null);
                continue;
            }
            if (temp.left != null){
                l1.add(temp.left);
            }
            if (temp.right != null){
                l1.add(temp.right);
            }
        }
        return list;
    }
}
