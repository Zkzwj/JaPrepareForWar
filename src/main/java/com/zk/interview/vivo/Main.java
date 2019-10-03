package com.zk.interview.vivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @Author: zking
 * @Date: 2019/9/11 17:06
 * @Content:
 */
public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int output = solution(inputStr );
        System.out.println(output);
    }

    private static int solution(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i= 0; i < chars.length;i++){
            if (chars[i] == '('){
                stack.push(chars[i]);
            }
            if (chars[i] == ')'){
                stack.pop();
            }
            if(chars[i] == '0'){
                break;
            }
        }
        return stack.size();

    }
}
