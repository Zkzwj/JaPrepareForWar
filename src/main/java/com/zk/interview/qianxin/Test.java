package com.zk.interview.qianxin;

import java.util.Scanner;

public class Test {

    public static String toString(double x) {
        String[] capital = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        String[] integerUnit = { "", "拾", "佰", "仟", "万" };
        String[] floatUnit = { "分", "角" };
        String money = Double.toString(x);// 得到字符串形式的金额信息
        System.out.println(money);
        String[] dot = money.split("\\.");// 拆分字符串
        // System.out.println(dot.length);
        // System.out.println(dot[0]);
        // System.out.println(dot[1]);
        int per = Integer.parseInt(dot[0]);// 将整数部分放入int型变量中
        int after = Integer.parseInt(dot[1]);// 将小数部分放到int型变量中
        int perLong = dot[0].length();//计算小数点前面部分的长度
        int afterLong = dot[1].length();//计算小数点后面部分的长度
        for (int i = perLong; i > 0; i--) {//输出小数点前面部分的大写形式
            int every = per / (int) (Math.pow(10, (i - 1)));//相当于坐标，对应capital数组下标
            per = per % (int) (Math.pow(10, (i - 1)));
            if(every==0){//如果有0则跳出本层循环，进入下层
                break;
            }
            System.out.print(capital[every]);//输出数字大写
            System.out.print(integerUnit[i - 1]);//输出单位，
        }
        System.out.print("元");
        if (!dot[1].equals("0")) {//当小数部分存在时才执行
//			for(int i=0;i<afterLong;i++) {//原理与整数部分相同
//				int every=after/(int)(Math.pow(10,afterLong-i));
//				System.out.print(capital[every]);
//				System.out.print(floatUnit[i]);
//				after=after%(int)(Math.pow(10, afterLong-i));
//			}
            for (int i = afterLong; i > 0; i--) {
                int every = after / (int) (Math.pow(10, (i - 1)));
                after = after % (int) (Math.pow(10, (i - 1)));
                System.out.print(capital[every]);
                System.out.print(floatUnit[i - 1]);
            }
        } else {
            System.out.print("整");
        }

        return null;

    }

    public static void main(String[] args) {
        Test r = new Test();
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入金额");
        double d=scan.nextDouble();
        r.toString(d);
    }

}
