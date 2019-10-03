package com.zk.interview.vivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: zking
 * @Date: 2019/9/11 17:34
 * @Content:
 */
public class Main3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        int output = solution(input);
        System.out.println(output);
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    private static int solution(int[] input) {
        int len = input.length;
        int[][][] dp = new int[len][len][len];
        for (int j = 0; j < len; j++){
            for (int k = 0; k <= j; k++){
                dp[j][j][k] = (k + 1)*(k + 1);
            }
        }
        for (int l = 1; l < len; l++){
            for (int j = l; j < len; j++){
                int i = j - l;
                for (int k = 0; k <= i; k++){
                    int res = (k+1)*(k+1) + dp[i+1][j][0];
                    for (int m = i + 1; m <= j; m++){
                        if (input[m] == input[i]){
                            res = Math.max(res, dp[i+1][m-1][0]+dp[m][j][k+1]);
                        }
                    }
                    dp[i][j][k] = res;
                }
            }
        }
        return (len == 0 ? 0 : dp[0][len-1][0]);
    }
}
