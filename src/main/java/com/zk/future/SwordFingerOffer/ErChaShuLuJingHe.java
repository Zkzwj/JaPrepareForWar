package com.zk.future.SwordFingerOffer;

import com.zk.future.TreeNode;

import java.util.ArrayList;

/**
 * @Author: zking
 * @Date: 2019/9/11 14:22
 * @Content: 找到二叉树路径和为n的路径
 */
public class ErChaShuLuJingHe {

    static ArrayList<ArrayList<Integer>> as = new ArrayList<>();
    static ArrayList<Integer> s = new ArrayList<>();

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
        ArrayList<ArrayList<Integer>> arrayLists = FindPath(n1, 8);
        System.out.println(arrayLists);
        ArrayList<ArrayList<Integer>> arrayLists1 = PrintPath(n1);
        System.out.println(arrayLists1);
    }

    /**
     * 路径和为target的路径
     * @param root
     * @param target
     * @return
     */
    private static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> allStep = new ArrayList<>();
        if (root == null) {
            return allStep;
        }
        findPath(allStep, new ArrayList<>(), target, root);
        return allStep;
    }

    /**
     * @param allStep 所有路径,最终返回的数据集合
     * @param step
     * @param target
     * @param root
     */
    public static void findPath(ArrayList<ArrayList<Integer>> allStep, ArrayList<Integer> step, int target, TreeNode root) {
        if (root.left == null && root.right == null) {// 若此时的root的已经为叶子节点则添加到step中
            step.add(root.val);
            if (target == root.val) {
                allStep.add(step);
            }
            return;
        }
        step.add(root.val);
        ArrayList<Integer> newStep = new ArrayList<>();
        newStep.addAll(step);
        if (root.left != null) {
            findPath(allStep, step, target - root.val, root.left);
        }
        if (root.right != null) {
            // 若将此处的newStep更改为 step则，打印查看
            findPath(allStep, newStep, target - root.val, root.right);
        }
    }

    /**
     * 打印所有路径
     * @param root
     * @return
     */
    private static ArrayList<ArrayList<Integer>> PrintPath(TreeNode root) {
        if (root == null) {
            return as;
        }
        s.add(root.val);
        if (root.left == null && root.right == null) {
            as.add(new ArrayList<>(s));
        }else {
            PrintPath(root.left);
            PrintPath(root.right);
        }
        s.remove(s.size() -1);
        return as;
    }

}


