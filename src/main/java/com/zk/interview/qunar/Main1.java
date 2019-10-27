package com.zk.interview.qunar;


public class Main1 {

    public static void main(String[] args) {
        int sum = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        java.util.Arrays.sort(num);
        while (n >= 4) {
            if (2 * num[0] + num[n - 1] + num[n - 2] > 2 * num[1] + num[0] + num[n - 1])
                sum += 2 * num[1] + num[0] + num[n - 1];
            else
                sum += 2 * num[0] + num[n - 1] + num[n - 2];
            n -= 2;
        }
        if (n == 3){
            sum += num[0] + num[1] + num[2];
        }else if (n == 2) {
            sum += num[1];
        }else{
            sum += num[0];
        }
        System.out.print(sum);
    }
}
