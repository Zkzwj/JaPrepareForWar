package com.zk.future.SwordFingerOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: zking
 * @Date: 2019/9/12 15:18
 * @Content:
 */
public class ZiFuChuanQuanPaiLie {

    public static void main(String[] args) {
        ZiFuChuanQuanPaiLie z = new ZiFuChuanQuanPaiLie();
        String s = "abc";
        ArrayList<String> p = z.Permutation(s);
        System.out.println(p);
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();//根据返回类型需要
        if (str == null || str.length() == 0) {
            return result;
        }
        char[] chars = str.toCharArray();
        TreeSet<String> res = new TreeSet<String>(); //用于排序输出
        getResult(chars, 0, str.length() - 1, res);
        result.addAll(res);//添加到ArrayList
        return result;
    }

    public void getResult(char[] chars, int start, int end, TreeSet<String> res) {
        if (start == end) {
            res.add(String.valueOf(chars));
        } else {
            for (int i = start; i <= end; i++) {
                swap(chars, start, i);//换一位
                getResult(chars, start + 1, end, res);//递归
                swap(chars, start, i);//换回来，保证下次换位是正确的
            }
        }
    }

    public void swap(char[] chars, int a, int b) {
        if (a != b) {//因为会出现原位置与原位置交换，直接空即可
            char temp = chars[a];
            chars[a] = chars[b];
            chars[b] = temp;
        }
    }
}
