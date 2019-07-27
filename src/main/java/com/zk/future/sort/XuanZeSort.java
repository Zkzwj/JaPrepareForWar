package com.zk.future.sort;

/**
 * @Author: zking
 * @Date: 2019/7/13 21:46
 * @Content: 选择排序
 */
public class XuanZeSort {

    public static void main(String[] args) {
        int arr[] = {8,5,9,7,2};
        int[] sort = sort(arr);
        for (int i = 0; i < sort.length; i++){
            System.out.print(sort[i]+" ");
        }
    }

    /**
     * 选择排序思路：①：找到数组中最小的元素，拿出来，将它和数组的第一个元素交换位置
     *              ②：在剩下的元素中寻找最小的元素，拿出来，将它和数组的第二个元素交换位置
     *              ③：一直循环到数组排序完成
     * @param arr
     * @return
     */
    public static int[] sort(int arr[]){
        for (int i = 0; i<arr.length; i++){
            int min = i;
            for (int j = i+1; j < arr.length; j++){
               if (arr[j] < arr[min]){
                   min = j;
               }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

}
