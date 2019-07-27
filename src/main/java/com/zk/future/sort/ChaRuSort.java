package com.zk.future.sort;

/**
 * @Author: zking
 * @Date: 2019/7/14 9:39
 * @Content:插入排序
 */
public class ChaRuSort {

    public static void main(String[] args) {
        int arr[] = {8,5,9,7,2};
        int[] sort = a(arr);
        for (int i = 0; i < sort.length; i++){
            System.out.print(sort[i]+" ");
        }
    }

    /**
     * 插入排序思路：从假定无序的数组中任意选择一个元素，此时单个被选择元素是有序的不需要比较，
     *              继续从未排序区域拿出一个数，插入到已排序的区域中，该数字与一排好序的第一个元素比较，
     *              然后持续这样操作知道数组遍历完成
     * @param arr
     * @return
     */
    public static int[] sort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i){
            int value = arr[i];
            int j = 0;
            for (j = i-1;j>=0;j--){
                if (arr[j] < value){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = value;
        }
        return arr;
    }

   public static int[] a(int a[]){
        int len = a.length;
        for (int i = 1; i<len;i++){
            int value = a[i];
            int j = 0;
            for (j = i-1; j>=0;j--){
                if (a[j] <value){
                    a[j+1] =a[j];
                }else {
                    break;
                }
            }
            a[j+1] = value;
        }
        return a;
   }
}
