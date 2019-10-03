package com.zk.interview.sougou;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/16 18:56
 * @Content:  https://www.nowcoder.com/discuss/261543?type=0&order=0&pos=7&page=1
 */
public class Main {

    /**
     * 222.205.58.16
     * *.58.16
     * 222.205.58.*
     * *.16
     * 224.*
     * 222.205.58.17
     * 222.205.59.19
     * 223.205.59.16
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] str1 = new String[n];// 规则
        String[] str2 = new String[m];// 过滤内容
        for (int i = 0; i < n; i++) {
            str1[i] = sc.next();
        }
        for (int i = 0; i < m; i++) {
            str2[i] = sc.next();
        }

        for (int k = 0; k < m; k++) {

            int[] res = new int[n];
            Arrays.fill(res, 1);
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if (str1[i].charAt(0) == '*') { // 规则头为 *
                    int end = str2[k].length() - 1;
                    for (int j = str1[i].length() - 1; j >= 1; j--) {
                        if (str1[i].charAt(j) == str2[k].charAt(end)) {
                            end--;
                            continue;
                        } else {
                            res[i] = 0;
                            break;
                        }
                    }
                } else if (str1[i].charAt(str1[i].length() - 1) == '*') { // 规则尾为 *
                    int start = 0;
                    for (int j = 0; j <= str1[i].length() - 2; j++) {
                        if (str1[i].charAt(j) == str2[k].charAt(start)) {
                            start++;
                            continue;
                        } else {
                            res[i] = 0;
                            break;
                        }
                    }
                } else { // 其他情况
                    for (int j = 0; j < str1[i].length(); j++) {
                        if (str1[i].charAt(j) == str2[k].charAt(j)) {
                            continue;
                        } else {
                            res[i] = 0;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                sum += res[i];
            }
            if (sum == 0) {
                System.out.print(0 + " ");
            } else {
                System.out.print(1 + " ");
            }

        }
    }
}
