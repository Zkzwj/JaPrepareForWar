package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/20 22:05
 * @Content:
 */
public class ZuoXuanZhuanZiFuChuan {

    public static void main(String[] args) {
        ZuoXuanZhuanZiFuChuan z = new ZuoXuanZhuanZiFuChuan();
        String str = "abcXYZdef";
        int n = 1;
        System.out.println("原数组：" + str);
        String s = z.leftRotateString1(str, n);
        System.out.println("旋转后的数组：" + s);

    }

    public String LeftRotateString(String str, int n) {
        int len = str.length();
        if (len == 1) {
            return "";
        }
        if (len < n) {
            n = n % len;
        }
        StringBuilder sbu = new StringBuilder();
        char[] chars = str.substring(0, n).toCharArray();
        String ready = str.substring(n, len);
        sbu.append(ready);
        for (int i = 0; i < chars.length; i++) {
            sbu.append(chars[i]);
        }
        return sbu.toString();
    }


    public String leftRotateString1(String str, int n) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder(str);
        sb.append(sb2);
        return sb.toString().substring(n, n + str.length());
    }


}
