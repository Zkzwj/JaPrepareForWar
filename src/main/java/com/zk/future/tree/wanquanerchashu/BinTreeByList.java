package com.zk.future.tree.wanquanerchashu;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: zking
 * @Date: 2019/8/29 15:22
 * @Content:
 */
public class BinTreeByList {


    List<Node> nodes = null;
    private int[] datas = null;
    private int number;

    public BinTreeByList(int[] datas){
        this.datas = datas;
        this.number = this.datas.length;
    }

    /**
     * 创建完全二叉树
     */
    public void create(){
        nodes = new LinkedList<>();
        // 如果父节点编号为X，那么左子节点的编号是2X，右子节点的编号是2X+1
        for (int i=0; i < this.number; i++){
            nodes.add(new Node(datas[i]));
        }
        for (int noteId = 1; noteId <= this.number / 2; noteId++){
            // 索引从0开始，需要在节点编号上减1
            nodes.get(noteId - 1).leftChild = nodes.get(noteId * 2 -1);
            if (noteId * 2 < this.number){
                nodes.get(noteId - 1).rightChild = nodes.get(noteId *2);
            }
        }
    }


    public static class Node {
        Node leftChild;
        Node rightChild;

        int data;

        public Node(int data) {
            this.data = data;
        }
    }

}
