package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/22 19:54
 * @Content:
 */
public class ZiFuChuanZhuanZhengShu {

    public static void main(String[] args) {
        ZiFuChuanZhuanZhengShu z = new ZiFuChuanZhuanZhengShu();
        String str = "123";
        int i = z.StrToInt(str);
        int i1 = z.StrToInt1(str);
        System.out.println(i1);
    }

    public int StrToInt(String str) {
        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int fuhao = 0;
        if (a[0] == '-')
            fuhao = 1;
        int sum = 0;
        for (int i = fuhao; i < a.length; i++) {
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return fuhao == 0 ? sum : sum * -1;
    }

    public int StrToInt1(String str) {
        int length = str.length();
        int res = 0;
        String[] split = str.split("");
        for (int i = 0; i < length; i++) {
            int temp = Integer.valueOf(split[i]);
            res += temp * Math.pow(10, length - i - 1);
        }
        return res;
    }

}
