package com.zk.future.SwordFingerOffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zking
 * @Date: 2019/9/12 16:01
 * @Content: 一个元素在数组中出现的次数，是总元素的一般
 */
public class ChaoGuoYiBan {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        ChaoGuoYiBan c = new ChaoGuoYiBan();
        int i = c.MoreThanHalfNum_Solution1(arr);
        System.out.println(i);

    }

    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);// 先对数组进行排序
        int len = array.length;
        if (len == 1) {
            return array[0];
        }
        int temp = 1;
        int max = 0;// 出现的最多的次数
        int tempRes = 0;// 临时保存出现次数最多的元素
        int res = 0;// 保存出现次数最多的元素
        for (int i = 0; i < len - 1; i++) {
            if (array[i] == array[i + 1]) {
                temp++;
                tempRes = array[i];
            } else {
                if (max < temp) {
                    max = temp;
                    temp = 1;
                    res = tempRes;
                }
            }
        }
        if (max > len / 2) {
            return res;
        }
        return 0;
    }

    public int MoreThanHalfNum_Solution1(int[] array) {
        int length = array.length;
        if (length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            if (map.get(array[i]) * 2 > length) {
                return array[i];
            }
        }
        return 0;
    }

}
