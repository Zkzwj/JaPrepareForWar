package com.zk.future.tree;

import com.zk.future.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: zking
 * @Date: 2019/8/29 21:20
 * @Content:
 */
public class TreeMostDeepPaths {

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
        List<String> strings = binaryTreePaths(n1);
        System.out.println(strings);
    }

    private static List<String> binaryTreePaths(TreeNode root){
        List<String> paths = new LinkedList<>();
        if (root == null){
            return paths;
        }
        if (root.left == null && root.right == null){
            paths.add(root.val+"");
            return paths;
        }
        for (String path : binaryTreePaths(root.left)){
            paths.add(root.val+"->"+path);
        }
        for (String path : binaryTreePaths(root.right)){
            paths.add(root.val+"->"+path);
        }
        return paths;
    }

}
