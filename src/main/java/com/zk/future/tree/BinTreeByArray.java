package com.zk.future.tree;

/**
 * @Author: zking
 * @Date: 2019/9/4 11:36
 * @Content:
 */
public class BinTreeByArray {

    private int[] numners;

    public BinTreeByArray(int[] numners) {
        this.numners = numners;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x] + "  ");
        }
        System.out.println();

        BinTreeByArray tree = new BinTreeByArray(numbers);
        System.out.print("先序遍历：");
        tree.preOrder(1);
        System.out.println();
        System.out.print("中序遍历：");
        tree.inOrder(1);
        System.out.println();
        System.out.print("后续遍历：");
        tree.postOrder(1);
    }

    private void preOrder(int nodeId) {
        if (nodeId <= numners.length) {
            System.out.print(numners[nodeId - 1] + " ");
            preOrder(nodeId * 2);
            preOrder(nodeId * 2 + 1);
        }
    }


    private void inOrder(int nodeId) {
        if (nodeId <= numners.length) {
            inOrder(nodeId * 2);
            System.out.print(numners[nodeId - 1] + " ");
            inOrder(nodeId * 2 + 1);
        }
    }


    private void postOrder(int nodeId) {
        if (nodeId <= numners.length) {
            postOrder(nodeId * 2);
            inOrder(nodeId * 2 + 1);
            System.out.print(numners[nodeId - 1] + " ");
        }
    }
}
