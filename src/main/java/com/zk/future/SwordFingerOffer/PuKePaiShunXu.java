package com.zk.future.SwordFingerOffer;

import java.util.Arrays;

/**
 * @Author: zking
 * @Date: 2019/9/22 15:56
 * @Content:
 */
public class PuKePaiShunXu {

    public static void main(String[] args) {
        PuKePaiShunXu p = new PuKePaiShunXu();
    }

    public boolean isContinuous(int[] numbers) {
        if(numbers == null)
            return false;
        Arrays.sort(numbers);  //先排序
        int zero = 0, i = 0;
        for(; i < numbers.length && numbers[i] == 0; i++){
            zero ++;  //统计0的个数
        }
        for(; i < numbers.length - 1 && zero >= 0; i++){
            if(numbers[i] == numbers[i+1]) //有对子，则返回false
                return false;
            if(numbers[i] + 1 + zero >= numbers[i+1]){  //可以继续匹配
                zero -= numbers[i+1] - numbers[i] - 1;
            }
            else
                return false;
        }
        if(i == numbers.length -1)
            return true;
        else
            return false;
    }

}
