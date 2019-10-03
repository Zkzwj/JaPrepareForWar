package com.zk.future.SwordFingerOffer;

import com.sun.org.apache.regexp.internal.RE;
import com.zk.future.test.S;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.*;
import java.util.HashMap;

/**
 * @Author: zking
 * @Date: 2019/9/16 16:31
 * @Content:
 */
public class ShuZiZaiShuZuZhongChuXianDeCiShu {


    public static void main(String[] args) {
        ShuZiZaiShuZuZhongChuXianDeCiShu s = new ShuZiZaiShuZuZhongChuXianDeCiShu();
        int[] arr = {1,2,3,4,5,6,6,6,7};
        int i = s.GetNumberOfK1(arr, 6);
        System.out.println(i);

    }

    public int GetNumberOfK(int [] array , int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        if (map.containsKey(k)){
            return map.get(k);
        }
        return 0;
    }

    public int GetNumberOfK1(int [] array , int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
           if (array[i] == k){
               count++;
           }else {
               continue;
           }
        }
        return count;
    }
}
