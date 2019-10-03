package com.zk.interview.others;


import java.util.*;

/**
 * @Author: zking
 * @Date: 2019/9/26 20:21
 * @Content:
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Double>> res = new ArrayList<>();
        ArrayList<Double> midPro = new ArrayList<>();
        String st = sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            Double a = Double.valueOf(s1[0]);
            Double t = Double.valueOf(s1[1]);
            midPro.add(a);
            midPro.add(t);
            midPro.add(a * t);
            res.add(new ArrayList<>(midPro));
            midPro.clear();
        }
        Collections.sort(res, new Comparator<ArrayList<Double>>() {
            @Override
            public int compare(ArrayList<Double> o1, ArrayList<Double> o2) {
                return o2.get(2).compareTo(o1.get(2));
            }
        });
        double l = 0;
        double v = 0;
        for (int i = 0; i < res.size(); i++) {
            ArrayList<Double> arrayList = res.get(i);
            Double a = arrayList.get(0);
            Double t = arrayList.get(1);
            double l1 = 0;
            if (i == 0) {
                l1 = 0.5 * a * t * t;
                v = a * t;
            } else {
                l1 = (v * t) + (0.5 * a * t * t);
                v = v + (a * t);
            }
            l += l1;
        }
        System.out.println(l);
    }
}
