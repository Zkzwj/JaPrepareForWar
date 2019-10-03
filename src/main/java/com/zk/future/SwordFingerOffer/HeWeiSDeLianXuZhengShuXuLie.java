package com.zk.future.SwordFingerOffer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/19 14:55
 * @Content:
 */
public class HeWeiSDeLianXuZhengShuXuLie {

    public static void main(String[] args) {
        HeWeiSDeLianXuZhengShuXuLie f = new HeWeiSDeLianXuZhengShuXuLie();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arrayLists = f.FindContinuousSequence(n);
        System.out.println(arrayLists);
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (sum < 3) return result;
        int start = 1;
        int end = 2;
        int middle = (1 + sum) / 2;
        int tmp = start + end;
        list.add(start);
        list.add(end);
        // 若是Start大于middle的话 和必然大于sum
        while (start < middle) {
            if (tmp == sum) {// 若相等则将list放入res中
                result.add(new ArrayList<Integer>(list));
                end++;
                tmp += end;
                list.add(end);
            } else if (tmp < sum) {// 若累加和仍然小于sum则持续将结果放到list中
                end++;
                tmp += end;
                list.add(end);
            } else {// 若累加和大于sum，则将最早加入list的数据清除
                tmp -= start;
                list.remove(new Integer(start));
                start++;
            }
        }
        return result;
    }

    public ArrayList<ArrayList<Integer>> FindContinuousSequence1(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (sum < 3){
            return res;
        }
        int start = 1;
        int end = 2;
        int mid = (sum + 1)/2;
        int count = start +end;
        list.add(start);
        list.add(end);
        while (start < mid){
            if (count == sum){
                res.add(new ArrayList<>(list));
                end++;
                count += end;
                list.add(end);
            }else if (count < sum){
                end++;
                count += end;
                list.add(end);
            }else {
                count -= start;
                list.remove(new Integer(start));
                start++;
            }
        }
        return res;
    }
}
