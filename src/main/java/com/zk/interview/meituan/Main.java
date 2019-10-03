package com.zk.interview.meituan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: zking
 * @Date: 2019/9/11 15:57
 * @Content: https://blog.csdn.net/Michean/article/details/90217498
 */
public class Main {

    private static final String[] CN_UPPER_NUMBER = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
    private static final String[] CN_UPPER_MONETRAY_UNIT = { "分", "角", "元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟", "兆", "拾", "佰", "仟" };
    private static final String CN_FULL = "整";
    private static final String CN_NEGATIVE = "负";
    private static final int MONEY_PRECISION = 2;
    private static final String CN_ZEOR_FULL = "零元整";

    //["200.00","201.15","1015","200001010200"]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String substring = s.substring(1, s.length() - 1);
        String[] split = substring.split(",");
        ArrayList<String> strings = get(split);
        System.out.println(strings);
    }


    public static ArrayList<String> get(String[] str){
        int len = str.length;
        ArrayList<String> rest = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            String substring = str[i].substring(1, str[i].length() - 1);
            double d = Double.parseDouble(substring);
            rest.add("\""+getAll(new BigDecimal(d))+"\"");
        }
        return rest;
    }
    /**
     * 把输入的金额转换为汉语中人民币的大写
     *
     * @param temp
     *            输入的金额
     * @return 对应的汉语大写
     */
    public static String getAll(BigDecimal temp) {
        StringBuffer sb = new StringBuffer();
        int signum = temp.signum();
        if (signum == 0) {
            return CN_ZEOR_FULL;
        }
        long number = temp.movePointRight(MONEY_PRECISION).setScale(0, 4).abs().longValue();
        long scale = number % 100;
        int numUnit = 0;
        int numIndex = 0;
        boolean getZero = false;
        if (!(scale > 0)) {
            numIndex = 2;
            number = number / 100;
            getZero = true;
        }
        if ((scale > 0) && (!(scale % 10 > 0))) {
            numIndex = 1;
            number = number / 10;
            getZero = true;
        }
        int zeroSize = 0;
        while (true) {
            if (number <= 0) {
                break;
            }
            numUnit = (int) (number % 10);
            if (numUnit > 0) {
                if ((numIndex == 9) && (zeroSize >= 3)) {
                    sb.insert(0, CN_UPPER_MONETRAY_UNIT[6]);
                }
                if ((numIndex == 13) && (zeroSize >= 3)) {
                    sb.insert(0, CN_UPPER_MONETRAY_UNIT[10]);
                }
                sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
                sb.insert(0, CN_UPPER_NUMBER[numUnit]);
                getZero = false;
                zeroSize = 0;
            } else {
                ++zeroSize;
                if (!(getZero)) {
                    sb.insert(0, CN_UPPER_NUMBER[numUnit]);
                }
                if (numIndex == 2) {
                    if (number > 0) {
                        sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
                    }
                } else if (((numIndex - 2) % 4 == 0) && (number % 1000 > 0)) {
                    sb.insert(0, CN_UPPER_MONETRAY_UNIT[numIndex]);
                }
                getZero = true;
            }
            number = number / 10;
            ++numIndex;
        }
        if (signum == -1) {
            sb.insert(0, CN_NEGATIVE);
        }
        if (!(scale > 0)) {
            sb.append(CN_FULL);
        }
        return sb.toString();
    }

}
