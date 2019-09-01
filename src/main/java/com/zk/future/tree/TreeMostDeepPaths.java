package com.zk.future.tree;

import com.zk.future.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: zking
 * @Date: 2019/8/29 21:20
 * @Content:
 */
public class TreeMostDeepPaths {



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
