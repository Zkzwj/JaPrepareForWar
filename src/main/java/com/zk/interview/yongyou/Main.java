package com.zk.interview.yongyou;

import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/26 15:46
 * @Content:
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = str.substring(1, str.length() - 1);
        String st[] = sub.split(",");
        int nums[] = new int[st.length];
        int result[] = new int[st.length];
        for (int i = 0; i < nums.length; i++) {
            st[i] = st[i].trim();
            nums[i] = Integer.parseInt(st[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            result[i] = getLength(nums, nums[i], i);
        }
        String sting = "[";
        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                sting += result[i] + "]";
            } else {
                sting += result[i] + ", ";
            }
        }
        System.out.println(sting);
    }

    private static int getLength(int[] nums, int key, int index) {
        int idx = 0;
        boolean flag = false;
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > key) {
                idx = i;
                flag = true;
                break;
            }
        }
        return flag == true ? idx - index : 0;
    }
}
