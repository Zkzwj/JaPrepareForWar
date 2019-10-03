package com.zk.future.tree;

import com.zk.future.TreeNode;
import com.zk.future.test.S;
import com.zk.interview.yuanfudao.LinkedQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/9/4 16:27
 * @Content:
 */
public class ErChaTreeDepth {

    public static void main(String[] args) {TreeNode n1 = new TreeNode(1);
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


        //levelIterator(n1);
        levelOrder(n1);
        System.out.println(n1);
        //getMaxDepth(n1);
        //System.out.println();

    }
    // 深度
    private static void levelOrder(TreeNode root) {
        if (root == null) {
            System.out.println(0);
        }
        int dep = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            dep++;
            while (count > 0) {
                TreeNode temp = queue.peek();
                queue.poll();
                if (temp.left != null) {
                    queue.add(temp.left);
                    stack.push(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                count--;
            }
        }
        System.out.println(stack.peek());
        System.out.println(dep);
    }
    // 递归获取深度
    private static int diGui(TreeNode root) {
        if (root == null) {
            System.out.println(0);
            return 0;
        } else {
            int left = diGui(root.left);
            int right = diGui(root.right);
            int dep = Math.max(left, right) + 1;
            return dep;
        }
    }


    private static ArrayList<Integer> getLeft(TreeNode root){
        if (root == null){
            return null;
        }
        int val = root.val;
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        list.add(val);
        int last = 1;
        int next = 0;
        while (!queue.isEmpty()){
            TreeNode temp = queue.peek();
            queue.poll();
            if (temp.left != null){
                queue.add(temp.left);
                next++;
            }
            if (temp.right != null){
                queue.add(temp.right);
                next++;
            }
            last--;
            if (last == 0){
                if (next != 0){
                    val = queue.peek().val;
                    list.add(val);
                }
                last = next;
                next = 0;
            }
        }
        return list;
    }

}
