package com.zk.interview.ctrip;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 豚厂开发了一个酒店客服机器人，机器人要送水到客人房间，此时机器人在一个M X
 * N网格的左上角，客人房间在网格右下角，这个机器人在任意点只能向下或向右移动一步，机器人要把水送到客人房间，有多少种可能的唯一路径？
 *
 * 说明：
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 *
 * M 和 N 的值均不超过 100。
 *
 * 输入 第一行输入网格的长宽M和N；
 *
 * 第二行至M+1行,输入障碍物和空位，以空格分开。
 *
 * 输出 机器人在给定网格上可能的路径数。
 *
 *
 * 样例输入 3 3 0 0 0 0 1 0 0 0 0 样例输出 2
 *
 */
public class Main2 {

	/*
	 * 请完成下面这个函数，实现题目要求的功能 当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
	 * *****************************开始写代码*****************************
	 */
	static int DynamicPathPlanning(int[][] matrixGrid) {

		return 1;
	}

	/****************************** 结束写代码 ******************************/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _matrixGrid_rows = 0;
		int _matrixGrid_cols = 0;
		_matrixGrid_rows = Integer.parseInt(in.nextLine().trim());
		_matrixGrid_cols = Integer.parseInt(in.nextLine().trim());

		int[][] _matrixGrid = new int[_matrixGrid_rows][_matrixGrid_cols];
		for (int _matrixGrid_i = 0; _matrixGrid_i < _matrixGrid_rows; _matrixGrid_i++) {
			for (int _matrixGrid_j = 0; _matrixGrid_j < _matrixGrid_cols; _matrixGrid_j++) {
				_matrixGrid[_matrixGrid_i][_matrixGrid_j] = in.nextInt();

			}
		}

		if (in.hasNextLine()) {
			in.nextLine();
		}

		res = DynamicPathPlanning(_matrixGrid);
		System.out.println(String.valueOf(res));

	}
}
