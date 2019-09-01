package com.zk.future.tree.wanquanerchashu;

/**
 * @Author: zking
 * @Date: 2019/8/29 15:48
 * @Content:
 */
public class TestTree {


    public static void main(String[] args) {
        int[] datas = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinTreeByList binTreeByList = new BinTreeByList(datas);
        binTreeByList.create();
        System.out.print("先序遍历");
        binTreeByList.preOrder(binTreeByList.nodes.get(0));
        System.out.println();
        System.out.print("中序遍历");
        binTreeByList.inOrder(binTreeByList.nodes.get(0));
        System.out.println();
        System.out.print("后续遍历");
        binTreeByList.postOrder(binTreeByList.nodes.get(0));
    }

}
