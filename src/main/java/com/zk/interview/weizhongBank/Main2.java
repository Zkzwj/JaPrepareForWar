package com.zk.interview.weizhongBank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/19 14:51
 * @Content:
 */
public class Main2 {

    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        String str = "x1y2z3";
        String[] split = str.split("\\d");
        for (String s : split){
            System.out.print(s + " ");
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            map.put(node1, node2);
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        list.add(start);
        HashMap<Integer, Integer> map1 = get(map, start, end);
        for (Integer i : map1.keySet()) {
            System.out.print(i + " ");
        }
    }

    private static HashMap<Integer, Integer> get(HashMap<Integer, Integer> map, int start, int end) {
        if (start == end) {
            return null;
        }
        Integer integer = map.get(start);
        list.add(integer);
        get(map, integer, end);
        for (int i = 0; i < list.size(); i++) {
            map.remove(list.get(i));
        }
        return map;
    }
}
