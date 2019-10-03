package com.zk.future.SwordFingerOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: zking
 * @Date: 2019/9/16 20:58
 * @Content:
 */
public class HeWeiSDeZhengShuXuLie {

    public static void main(String[] args) {

        HeWeiSDeZhengShuXuLie h = new HeWeiSDeZhengShuXuLie();
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> arrayList = h.FindContinuousSequence(arr, 4);
        System.out.println(arrayList);
    }

    public ArrayList<Integer> FindContinuousSequence(int[] array, int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < len; j++) {
                if (array[i] + array[j] == sum) {
                    list.add(array[i]);
                    list.add(array[j]);
                    list.add(array[i] * array[j]);
                }
            }
            if (!list.isEmpty()) {
                lists.add(list);
            }
        }
        if (lists.size() == 0) return new ArrayList<Integer>();
        Collections.sort(lists, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(2).compareTo(o2.get(2));
            }
        });
        System.out.println(lists);
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> temp = lists.get(0);
        for (int i = 0; i < temp.size() - 1; i++) {
            res.add(temp.get(i));
        }
        return res;
    }
}
