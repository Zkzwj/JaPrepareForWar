package com.zk.interview.didi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/8/27 18:57
 * @Content:
 */
public class Three {

    static final int N = 50000;
    static final int TOTAL = 300000;
    static final int START_COST = 1000;
    static final int END_COST = 50000;
    static int[] newDataA, newDataB;

    public static void main(String[] args) {
        s();
    }

    private static int s() {
        Scanner sc = new Scanner(System.in);
        String per = sc.nextLine();
        String[] s = per.split(" ");
        int nn = Integer.parseInt(s[0]);
        int tTotal = Integer.parseInt(s[1]);
        int cCost = Integer.parseInt(s[2]);
        if (nn < 1 || nn > N) {
            return 0;
        }
        if (tTotal < 1 || tTotal > TOTAL) {
            return 0;
        }
        if (cCost < START_COST || cCost > END_COST) {
            return 0;
        }
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] sA = a.split(" ");
        String[] sB = b.split(" ");
        int[] aA = new int[nn];
        int[] bB = new int[nn];
        for (int i = 0; i < nn; i++) {
            aA[i] = Integer.parseInt(sA[i]);
            bB[i] = Integer.parseInt(sB[i]);
        }
        int solove = solove(cCost, aA, bB);
        System.out.println(solove);
        return 0;
    }

    private static int solove(int cCost, int[] aA, int[] bB) {
        int cost = 0;
        int count = 0;
        for (int i = 0; i < aA.length; i++) {
            for (int j = 0; j < bB.length; j++) {
                if (aA[i] == bB[j]) {
                    count++;
                    cost = cCost - 1;
                    if (cost <= 0) {
                        return count;
                    }
                    newDataA = Arrays.copyOfRange(aA, i + 1, aA.length);
                    newDataB = Arrays.copyOfRange(bB, j + 1, bB.length);
                    solove(cost, newDataA, newDataB);
                }
            }
        }
        return count;

    }

}
