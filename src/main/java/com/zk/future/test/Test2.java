package com.zk.future.test;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] target = new int[n];
        for (int i = 0; i < n; i++){
            target[i] = sc.nextInt();
        }
        int point = sc.nextInt();
        int low = 0;
        int high = n-1;
        while (low <=  high){
            int mid = (low + high)/2;
            if (point < target[mid]){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
            if (point > target[mid] && point < target[mid+1]){
                System.out.println(mid+1);
                return;
            }
        }


    }
}
