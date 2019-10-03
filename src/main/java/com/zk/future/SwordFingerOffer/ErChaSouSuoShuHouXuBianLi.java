package com.zk.future.SwordFingerOffer;

/**
 * @Author: zking
 * @Date: 2019/9/11 11:44
 * @Content:
 */
public class ErChaSouSuoShuHouXuBianLi {

    /**
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
     * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     */
    public static void main(String[] args) {
        int[] sequence = {4, 8, 6, 12, 16, 14, 10};
        boolean solution = solution(sequence);
        System.out.println(solution);

    }

    private static boolean solution(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return isRight(sequence, 0, sequence.length - 1);
    }

    public static boolean isRight(int[] sequence, int start, int end) {
        // 边界判断
        if (start >= end)
            return true;
        int m = 0, t = 0;
        for (m = start; m < end; m++) {
            if (sequence[m] > sequence[end]) {
                break;
            }
        }
        for (t = m; t < end; t++)
            if (sequence[t] < sequence[end])
                break;
        if (t == end)
            return isRight(sequence, start, m - 1) && isRight(sequence, m, end - 1);
        return false;
    }
}
