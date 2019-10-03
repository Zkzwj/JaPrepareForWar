package com.zk.interview.TC58;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/12 20:44
 * @Content:
 */
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(",");
        int i = get(split);
        System.out.println(i);
    }

    private static int get(String[] split){
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < split.length; i++){
            set.add(split[i]);
        }
        return set.size();
    }
}
