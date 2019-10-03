package com.zk.interview.tengxun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/20 19:40
 * @Content:
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] len = new int[t];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            len[i] = sc.nextInt();
            list.add(sc.nextInt());
        }
        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        System.out.println(min + max);
    }


}
