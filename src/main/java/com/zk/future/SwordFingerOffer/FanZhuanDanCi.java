package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/17 14:26
 * @Content:
 */
public class FanZhuanDanCi {

    public static void main(String[] args) {
        String str = "student. a am I";
        FanZhuanDanCi f = new FanZhuanDanCi();
        String s = f.ReverseSentence(str);
        System.out.println(s);
    }

    public String ReverseSentence(String str) {
        if (str == null) {
            return null;
        }
        if (str.trim().equals("")) {
            return str;
        }
        String[] s = str.split(" ");
        StringBuilder sbu = new StringBuilder();
        int len = s.length;
        for (int i = len - 1; i >= 0; i--) {
            sbu.append(s[i] + " ");
        }
        return sbu.toString().trim();
    }

    public String ReverseSentence1(String str) {
        if (str == null) {
            return null;
        }
        String reverse = reverse(str);
        String[] res = reverse.split(" ");
        StringBuilder sbu = new StringBuilder();
        for (int i = 0; i < res.length; i++) {
            if (i == res.length - 1) {
                sbu.append(res[i]);
            } else {
                sbu.append(res[i] + " ");
            }
        }
        return sbu.toString();
    }

    public String reverse(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int len = chars.length - 1;
        while (i < len) {
            char temp = chars[len];
            chars[len] = chars[i];
            chars[i] = temp;
            i++;
            len--;
        }
        return String.valueOf(chars);
    }
}
