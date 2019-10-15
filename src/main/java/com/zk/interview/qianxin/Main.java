package com.zk.interview.qianxin;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private static final String[] CN_UPPER_NUMBER = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
    private static final String[] CN_UPPER_MONETRAY_UNIT = {"分", "角", "", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千", "兆", "十", "百", "千"};
    private static final String CN_NEGATIVE = "负";
    private static final int MONEY_PRECISION = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        double d = 0;
        try {
            d = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            System.out.println("错误输入");
            return;
        }
        if (d < 0 || d > 100000) {
            return;
        }
        String strings = getAll(new BigDecimal(d));
        System.out.println(strings);
    }

    /**
     * @param temp 输入的金额
     * @return 对应的汉语大写
     */
    public static String getAll(BigDecimal temp) {
        StringBuffer sb = new StringBuffer();
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
                getZero = true;
            }
            number = number / 10;
            ++numIndex;
        }
        return sb.toString();
    }
}
