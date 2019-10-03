package com.zk.interview.TC58;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/12 20:50
 * @Content:
 */
public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int contentChildren = findContentChildren(arr);
        System.out.println(contentChildren);
    }

    public static int findContentChildren(int[] greed) {
        int len = greed.length;
        int[] size = new int[len];
        for (int i = 0; i < len - 1; i++){
            if (greed[i] > greed[i+1] && i == 0){
                size[i] = 2;
            }else if (greed[i] < greed[i+1] && i == 0){
                size[i] = 1;
            }
            if (i == len -2 && greed[i] > greed[i+1]){
                size[i] = 1;
            }else if (i == len -2 && greed[i] < greed[i+1]){
                size[i] = 2;
            }
            if (i > 0 && i < len -2 && greed[i] > greed[i+1] && greed[i] > greed[i-1]){
                size[i] = 3;
            }
            if (i > 0 && i < len -2 && greed[i] < greed[i+1] && greed[i] > greed[i-1]){
                size[i] = 2;
            }
            if (i > 0 && i < len -2 && greed[i] > greed[i+1] && greed[i] < greed[i-1]){
                size[i] = 2;
            }
            if (i > 0 && i < len -2 && greed[i] < greed[i+1] && greed[i] < greed[i-1]){
                size[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < len; i++){
            sum += size[i];
        }
        return sum;
    }

    public static int findContentChildren1(int[] greed, int[] size) {
        Arrays.sort(greed);
        Arrays.sort(size);
        int g = 0;//用于定位循环中greed数组下标，和统计满足孩子数量
        int s = 0;//定位size数组下标
        while (g < greed.length && s < size.length) {
            if (greed[g] <= size[s]) {
                g++;
            }
            s++;
        }
        return g;
    }

}
