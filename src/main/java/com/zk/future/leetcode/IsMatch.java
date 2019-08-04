package com.zk.future.leetcode;

/**
 * @Author: zking
 * @Date: 2019/7/28 15:59
 * @Content:
 */
public class IsMatch {

    public static void main(String[] args) {
        String text = "mississippi";
        String pattern = "mis*is*p*.";
        boolean match = isMatch(text, pattern);
        System.out.println(match);
    }

    private static boolean isMatch(String t, String p) {
        if (p.isEmpty())
            return t.isEmpty();
        boolean first_match = (!t.isEmpty() && (p.charAt(0) == t.charAt(0) || p.charAt(0) == '.'));
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(t, p.substring(2)) ||
                    (first_match && isMatch(t.substring(1), p));
        }
        return first_match && isMatch(t.substring(1), p);

    }

}
