package com.zk.future.SwordFingerOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: zking
 * @Date: 2019/9/12 18:39
 * @Content:
 */
public class PinJieShuZiZuiXiao {

    public static void main(String[] args) {
        PinJieShuZiZuiXiao p = new PinJieShuZiZuiXiao();
        int[] arr = {3, 32, 321};
        String s = p.PrintMinNumber(arr);
        System.out.println(s);
    }

    public String PrintMinNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder("");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer str1, Integer str2) {
                String s1 = "" + str1 + str2;
                String s2 = "" + str2 + str1;
                return s1.compareTo(s2);
            }
        });
        for (int j : list) {
            sb.append(j);
        }
        return sb.toString();
    }

}
