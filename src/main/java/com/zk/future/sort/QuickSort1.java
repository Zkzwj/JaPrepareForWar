package com.zk.future.sort;

/**
 * @Author: zking
 * @Date: 2019/9/4 10:08
 * @Content:
 */
public class QuickSort1 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 3};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



    private static void quickSort(int[] arr, int left, int right){
        if (left < right){
            int index = div(arr, left, right);

            quickSort(arr, left, index-1);

            quickSort(arr, index+1, right);
        }
    }


    private static int div(int[] arr, int left, int right){
        int base = arr[left];
        while(left < right){
            while (left<right && arr[right] <= base){
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] >= base){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = base;
        return left;
    }
}
