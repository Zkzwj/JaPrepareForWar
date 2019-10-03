package com.zk.future;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LevelOrder {
	/*//层次遍历输出结果
	public static void levelIterator(TreeNode root){
		if(root == null) {
			return;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		TreeNode  current = null;
		queue.offer(root);
		while(!queue.isEmpty()) {
			current = queue.poll();
			if(current.left!=null) {
				queue.offer(current.left);
			}
			if(current.right!=null) {
				queue.offer(current.right);
			}
		}
	}*/



	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		if(root ==null) {
			return res;
		}
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			int count = q.size();
			//List<Integer> list = new ArrayList<>();
			int sum =0;
			while(count>0) {
				TreeNode temp = q.peek();//peek() 用于在队列的头部查询元素
				q.poll();//删除队列中的第一个元素
				sum+=temp.val;
				if(temp.left !=null) {
					q.add(temp.left);
				}
				if(temp.right !=null) {
					q.add(temp.right);
				}
				count--;
			}
			System.out.println(sum);
		}
		return res;
	}
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

		//levelIterator(n1);
		levelOrder(n1);
		System.out.println(n1);

	}
}
