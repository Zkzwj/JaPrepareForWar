package com.zk.future.sort.find;

/**
 * @Author: zking
 * @Date: 2019/9/1 19:26
 * @Content:
 */
public class ErFenChaZhao {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 3;
        int len = arr.length;
        int low = 0;
        int high = len - 1;
        boolean flag  = true;
        while (low <= high && flag) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                flag = false;
                System.out.println(arr[mid]);
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

    }


}
