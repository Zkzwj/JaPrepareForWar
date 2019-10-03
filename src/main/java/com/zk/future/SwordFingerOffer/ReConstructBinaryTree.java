package com.zk.future.SwordFingerOffer;

import com.zk.future.TreeNode;

import java.util.HashMap;

/**
 * @Author: zking
 * @Date: 2019/9/6 17:09
 * @Content:
 */
public class ReConstructBinaryTree {


    private static TreeNode reCreate(int[] pre, int[] in){
        if (pre == null || in == null){
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < in.length; i++){
            map.put(in[i], i);
        }
        TreeNode node = preIn(pre, 0, pre.length - 1, in, 0, in.length, map);
        return node;
    }

    private static TreeNode preIn(int[] pre, int pS, int pE, int[] in, int iS, int iE, HashMap<Integer, Integer> map){
        if (pS > pE){
            return null;
        }
        TreeNode head = new TreeNode(pre[pS]);
        int index = map.get(pre[pS]);
        head.left = preIn(pre, pS + 1, pS + index - iS, in, iS, index - 1, map);
        head.right = preIn(pre, pS + index - iS +1, pE, in, index + 1, iE, map);
        return head;
    }

}
