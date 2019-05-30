package com.zk.future.lambda;

public class BaseLambda {

    public static void main(String[] args) {
        // 1. 不需要参数,返回值为 5
        // () -> 5;

        // 2. 接收一个参数(数字类型),返回其2倍的值
        // x -> 2 * x

        // 3. 接受2个参数(数字),并返回他们的差值
        // (x, y) -> x – y;

        // 4. 接收2个int型整数,返回他们的和
        // (int x, int y) -> x + y

        // 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void
        // (s) -> System.out.print(s);
    }

}