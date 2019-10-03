package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/6 17:32
 * @Content:
 */
public class XuanZhuanShuZuZuiXiaoZhi {

    public static void main(String[] args) {

    }

    public static int resolove(int[] arr){
        if (arr.length == 0){
            return 0;
        }
        if (arr.length == 1){
            return arr[0];
        }
        for (int i = 0; i < arr.length -1;i++){
            if (arr[i] > arr[i+1]){
                return arr[i+1];
            }else {
                if (i == arr.length - 1){
                    return arr[0];
                }
            }
        }
        return 0;
    }
}
