package com.zk.interview.qunar;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()+1;
        if (n == 1){
            System.out.println(1);
            return;
        }
        int arr[][] = new int[n][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || arr[i].length - 1 == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                if (i == n - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}



