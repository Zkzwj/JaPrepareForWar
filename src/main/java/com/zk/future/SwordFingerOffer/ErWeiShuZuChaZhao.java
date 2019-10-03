package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/6 16:41
 * @Content:
 */
public class ErWeiShuZuChaZhao {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        boolean b = find1(arr, 4);
        System.out.println(b);
    }


    private static boolean find(int[][] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int low = 0;
            int high = arr[1].length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target > arr[i][mid]) {
                    low = mid + 1;
                } else if (target < arr[i][mid]) {
                    high = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean find1(int[][] arr, int target) {
        int len = arr.length;
        for (int i = 0; i < len; i++){
            int low = 0;
            int high = arr[i].length-1;
            for (int j = 0; j < high; j++){
                int mid = (low + high) /2;
                if (arr[i][mid] == target){
                    return true;
                }else if (arr[i][mid] > target){
                    high = mid - 1;
                }else {
                    low = mid +1;
                }

            }
        }
        return false;
    }
}
