package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/8/20 23:51
 * @Content:
 */
public class FindTwoArray {

    public static void main(String[] args) {
        int[][] array = {{2, 3},{4, 6}};
        boolean find = Find(2, array);
        System.out.println(find);
        find2(4, array);
    }

    public static boolean Find(int target, int [][] array) {
        int len = array.length; //二维数组长度
        for (int i = 0; i < len; i++) {
            int low = 0;
            int high =array[i].length-1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target > array[i][mid]) {
                    low = mid + 1;
                }else if(target < array[i][mid]){
                    high = mid -1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }


    private static void find2(int target, int[][] array){
        int rows = array.length;
        if (rows == 0){
            System.out.println(true);
        }
        int cols = array[0].length-1;
        if (cols == 0){
            System.out.println(true);
        }
        int row = 0;
        int col = array[0].length - 1;
        while (row <= rows && col >= 0) {
            if (array[row][col] > target){
                col--;
            }else if (array[row][col] < target){
                row++;
            }else {
                System.out.println(array[row][col]);
                return;
            }

        }
        System.out.println("GG");

    }
}
