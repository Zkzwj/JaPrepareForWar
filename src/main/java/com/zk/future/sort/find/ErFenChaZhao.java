package com.zk.future.sort.find;

/**
 * @Author: zking
 * @Date: 2019/9/1 19:26
 * @Content:
 */
public class ErFenChaZhao {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int low = 0;
        int high = arr.length - 1;
        while (low <=  high){
            int mid = (low + high)/2;
            if (target == arr[mid]){
                System.out.println(true);
                return;
            }else if (target < arr[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        System.out.println("數據不存在");

    }


}
