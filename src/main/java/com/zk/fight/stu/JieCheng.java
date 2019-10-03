package com.zk.fight.stu;

/**
 * @Author: zking
 * @Date: 2019/9/9 16:22
 * @Content:
 */
public class JieCheng {

    public static void main(String[] args) {
        int target = 3;
        int jiecheng = jiecheng(target);
        System.out.println(jiecheng);
    }

    private static int jiecheng(int n){
        if (n == 1){
            return 1;
        }else {
            return n * jiecheng(n-1);
        }
    }
}
