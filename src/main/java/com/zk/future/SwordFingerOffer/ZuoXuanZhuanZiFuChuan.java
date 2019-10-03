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
        int n = 3;
        System.out.println("原数组："+str);
        String s = z.LeftRotateString(str, n);
        System.out.println("旋转后的数组："+s);

    }

    public String LeftRotateString(String str,int n) {
        if (str.length() == 1){
            return "";
        }
        StringBuilder sbu = new StringBuilder();
        char[] chars = str.substring(0, n).toCharArray();
        String ready = str.substring(n, str.length());
        sbu.append(ready);
        for (int i = 0; i < chars.length; i++){
            sbu.append(chars[i]);
        }
        return sbu.toString();
    }


    public String LeftRotateString1(String str,int n) {
        StringBuilder sb=new StringBuilder(str);
        StringBuilder sb2=new StringBuilder(str);
        sb.append(sb2);
        return sb.toString().substring(n,n+str.length());
    }


}
