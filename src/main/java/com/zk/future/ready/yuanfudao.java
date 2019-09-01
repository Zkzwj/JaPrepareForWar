package com.zk.future.ready;

/**
 * @Author: zking
 * @Date: 2019/8/30 9:36
 * @Content:
 */
public class yuanfudao {

    public static void main(String[] args) {
        String translate = translate(27);
        System.out.println(translate);
    }
    /*作者：_温玉
    链接：https://www.nowcoder.com/discuss/220594?type=post&order=time&pos=&page=1
    来源：牛客网*/

    public static String translate(int n) {
        StringBuilder sb = new StringBuilder();
        do {
            n--;
            sb.append(((char) (n % 26 + 'A')));
            n = (n - n % 26) / 26;
        } while (n > 0);

        return sb.reverse().toString();
    }
}
