package com.zk.interview.tigger;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zking
 * @Date: 2019/8/23 18:49
 * @Content:
 */
public class Two {

    public static void main(String[] args) {
        Set<String> set = permutations("abc");
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static Set<String> permutations(String str) {
        //每一组排列都被存储在字符串列表中
        Set result = new HashSet<>();
        // 基本情况
        if (str.length() == 1) {
            result.add(str);
        } else {
            //对字符串每一个字符执行操作
            for (int i = 0; i < str.length(); i++) {
                //对EveryThingElse返回的字符串组合进行操作
                for (String p : permutations(EverythingElse(str, i))) {
                    //插入当前字符到排列中
                    result.add(str.charAt(i) + p);
                }
            }
        }
        return result;
    }

    private static String EverythingElse(String str, int IndexToIngore) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (IndexToIngore != i) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
