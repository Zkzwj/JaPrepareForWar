package com.zk.interview.didi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/8/27 18:56
 * @Content:
 */
public class One {

    static final int N = 50000;
    static final int TOTAL = 300000;
    static final int START_COST = 1000;
    static final int END_COST = 50000;
    static int[] newDataA, newDataB;

    public static void main(String[] args) {
        s();
    }

    /**
     * 题目描述：
     * 现在有A，B两个序列，两个序列都是拥有n个元素，你有两种操作：
     * 1. 从A序列中选择一个非空前缀，再从B序列中选择一个非空前缀，
     * 要求选择的这两个前缀的末尾元素相等。把这两个前缀移除，
     * 这个操作将花费Cost代价，但是这个操作可以使你得到一颗宝石。
     * 2. 您可以重复第1步的操作；最终，您需要花费两个序列剩余元素数量之和大小的代价，
     * 移除两个序列中剩下的所有元素（这最后一步是没有宝石的），这时游戏结束。
     * <p>
     * 要求总代价不超过Total，且序列中不得有剩余，那么最多可以获得多少宝石。
     * 输入:
     * 输入第一行包含三个正整数n, Total , Cost ,  (1<=n<=5*10^4 , 1<=Total<=3*10^5 , 10^3<=Cost<=10^4)
     * 接下来两行，每行n个数，表示A，B序列
     * 输出:
     * 一个数表示最多可以获得的宝石数量
     * 输入：
     * 5 10000 1000
     * 5 4 3 2 1
     * 1 5 4 2 3
     * 输出 3
     * 自测输入
     * 5 10000 1000
     * 5 3 4 2 1
     * 1 5 4 2 3
     * 输出有问题
     */
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
        solove(nn, cCost, aA, bB);
        return 0;
    }

    private static void solove(int nn, int cCost, int[] aA, int[] bB) {
        int cost = 0;
        int len = 0;
        for (int i = 0; i < nn; i++) {
            if (aA[i] == bB[i]) {
                System.out.println(i);
                cost = cCost - i;
                if (cost <= 0) {
                    return;
                }
                len = i + 1;
                newDataA = Arrays.copyOfRange(aA, len, aA.length);
                newDataB = Arrays.copyOfRange(bB, len, bB.length);
                if (len == 0) {
                    return;
                }
                solove(aA.length - len, cost, newDataA, newDataB);
            }
        }
    }
}
