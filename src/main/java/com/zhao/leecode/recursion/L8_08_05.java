package com.zhao.leecode.recursion;

/**
 * 面试题 08.05. 递归乘法
 * https://leetcode-cn.com/problems/recursive-mulitply-lcci/
 *
 * @Author Le Zhao
 * @Date 2021/12/29 4:09 下午
 */
public class L8_08_05 {
    public static int multiply(int A, int B) {
        if (A == 1) {
            return B;
        }
        int r = multiply(A / 2, B);
        if (A % 2 == 1) {
            return r + r + B;
        } else {
            return r + r;
        }
    }
}
