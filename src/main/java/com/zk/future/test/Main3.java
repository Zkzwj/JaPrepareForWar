package com.zk.future.test;

import java.util.*;

/**
 * @Author: zking
 * @Date: 2019/9/24 20:47
 * @Content:
 */
public class Main3 {

    public static void main(String[] args) {
        Integer a = 22;
        Integer b = 33;
        Integer i = a ^ b;
        String s = Integer.toBinaryString(i);
        System.out.println(s);

    }


    private void get1() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int nextInt = sc.nextInt();
        if (nextInt > 500 || str.length() > 500) {
            return;
        }
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < nextInt; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
            if (map.get(chars[i]) > 1) {
                System.out.println(chars[i]);
                break;
            }
        }
    }

    private void  get2(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        String s1 = Integer.toBinaryString(Integer.parseInt(s[0]));
        String s2 = Integer.toBinaryString(Integer.parseInt(s[1]));

        int count = 0;
        int l1 = s1.length();
        int l2 = s2.length();
        int len = l1 < l2 ? l1 : l2;
        boolean flag = false;
        if (l1 < l2) {
            flag = false;
        } else {
            flag = true;
        }
        int chazhi = Math.abs(l1 - l2);
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < len; i++) {
            if (!flag && c1[i] != c2[chazhi + i]) {
                count++;
            } else if (flag && c1[chazhi + i] != c2[i]) {
                count++;
            }
        }
        System.out.println(count + chazhi);
    }
}
