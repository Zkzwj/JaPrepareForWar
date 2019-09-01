package com.zk.interview.yuanfudao;

import com.zk.future.test.S;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zking
 * @Date: 2019/9/1 13:59
 * @Content:
 */
public class ZiFuQuanPai {

    public static void main(String[] args) {

        String s = "abc";
        Set<String> p = p(s);
        for (String st : p){
            System.out.print(st+ " ");
        }

    }

    private static Set<String> p(String s){
        Set<String> set = new HashSet<>();
        if (s.length() == 1){
            set.add(s);
        }else {
            for (int i = 0; i < s.length(); i++){
                for (String st: p(getZ(s, i)) ) {
                    set.add(s.charAt(i) + st);
                }
            }
        }
        return set;
    }

    private static String getZ(String s, int index){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (i != index){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
