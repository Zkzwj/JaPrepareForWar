package com.zk.interview.qianxin;

import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/9 19:53
 * @Content:
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 深度
        int dep = sc.nextInt();
        String temp = sc.nextLine();// 解决nextInt 与 nextLine连用问题
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int len = s1.length;
        // 树节点
        int[] nodes = new int[len];
        for (int i = 0; i < len; i++) {
            nodes[i] = Integer.parseInt(s1[i]);
        }
        // 左右节点
        int[] lAndR = new int[2];
        for (int i = 0; i < lAndR.length; i++){
            lAndR[i] = sc.nextInt();
        }
        System.out.println();
    }
}
