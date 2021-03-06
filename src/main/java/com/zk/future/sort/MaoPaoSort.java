package com.zk.future.sort;

import java.io.Serializable;

/**
 * @Author: zking
 * @Date: 2019/7/13 21:21
 * @Content:冒泡排序，时间复杂度为：O(n^2)
 */
public class MaoPaoSort implements Serializable {

    private static final long serialVersionUID = 5151012308184063970L;

    public static void main(String[] args) {
        int arr[] = {8,5,9,7,2};
        int[] sort = sort(arr);
        int[] ints = optimizationSort(arr);
        for (int i = 0; i < ints.length; i++){
            System.out.print(ints[i]+" ");
        }
    }

    public static int[] sort(int arr[]){
        for (int i = 0; i <arr.length; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                int temp = 0;
                if (arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 优化冒泡排序:数组若是有序只遍历一遍就ok
     * @param arr
     * @return
     */
    public static int[] optimizationSort(int arr[]){

        for (int i = 0; i <arr.length; i++){
            boolean isSort = true;
            for (int j = 0; j < arr.length - 1 - i; j++){
                int temp = 0;
                if (arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSort = false;
                }
            }
            if (isSort){
                break;
            }
        }
        return arr;
    }

}
