package com.zk.interview.tengxun;

import java.util.*;

/**
 * @Author: zking
 * @Date: 2019/9/20 19:48
 * @Content:
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        get(list, k);
    }

    private static void get(List<Integer> list, int k) {
        int sum = 0;
        for (int y = 0; y < k; y++) {
            Integer min = Collections.min(list);
            int i = list.indexOf(min);
            Integer res = list.get(i);
            if (res - sum == 0) {
                k++;
            }else if (res < 0 ){
                System.out.println(res);
            }else {
                System.out.println(res - sum);
            }
            list.remove(i);
            sum = res;
        }
    }
}
