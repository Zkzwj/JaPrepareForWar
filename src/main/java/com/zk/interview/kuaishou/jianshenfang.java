package com.zk.interview.kuaishou;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/8/25 17:46
 * @Content:
 */
public class jianshenfang {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dis = new int[n];
        int[] xg = new int[n];
        for (int i=0;i<n;i++){
            dis[i] = sc.nextInt();
            xg[i] = sc.nextInt();
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            res[i] = xg[i] + (dis[i] * 2);
        }
        Arrays.sort(res);
        int k = 2;
        for (int i = n; i<k; i--){

        }
        System.out.println(res);



    }


}
