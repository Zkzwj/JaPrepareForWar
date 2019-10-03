package com.zk.future.tree;

/**
 * @Author: zking
 * @Date: 2019/9/4 15:35
 * @Content:
 */
public class CreateBSTfromSortedArray {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode treeNode = create(data);
        System.out.println(treeNode);
    }

    private static TreeNode create(int[] arr) {
        int len = arr.length;
       if (arr == null || len == 0){
           return null;
       }
       TreeNode[] head = new TreeNode[len];
       for (int i = 0; i < len; i++){
           head[i] = new TreeNode(arr[i]);
       }
       return realCreate(head, 0, len - 1);
    }

    private static TreeNode realCreate(TreeNode[] head, int start, int end) {
       if (start > end){
           return null;
       }
       int mid = (start + end) /2;
       TreeNode root = head[mid];
       root.left = realCreate(head, start, mid - 1);
       root.right = realCreate(head, mid+1, end);
       return root;
    }

    private static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
