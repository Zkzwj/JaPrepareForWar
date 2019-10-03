package com.zk.future.test;

/**
 * @Author: zking
 * @Date: 2019/9/15 21:48
 * @Content:
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] monster = new int[n + 1];
        int[] soldiers = new int[n];
        for (int i = 0; i < n + 1; i++) {
            monster[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            soldiers[i] = in.nextInt();
        }
        System.out.println(Solutin(monster, soldiers));
    }

    public static int Solutin(int[] monster, int[] soldiers) {
        if (monster.length == 0 || soldiers.length == 0)
            return 0;
        int max = 0;
        for (int i = 0; i < monster.length - 1; i++) {
            if (soldiers[i] >= monster[i] + monster[i + 1]) {
                max += monster[i] + monster[i + 1];
                monster[i + 1] = 0;
            } else {
                max += soldiers[i];
                monster[i + 1] = monster[i + 1] + monster[i] - soldiers[i];
            }
        }
        return max;
    }
}