package com.zhao.leecode.pro1;

/**
 * ERR
 * <p>
 * 剑指 Offer 67. 把字符串转换成整数
 * https://leetcode-cn.com/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:56 下午
 */

/**
 * 解题思路：
 * 使用一个下标，先过滤空格和非数字的字符
 */


public class L11_Offer_67 {
    public static int strToInt(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;

        if (n == 0) return 0;
        int i = 0;
        while (i < n && chars[i] == ' ') {
            i++;
        }

        if (i == n) return 0;

        int sign = 1;
        char c = chars[i];

        if (c == '-') {
            sign = -1;
            i++;
        } else if (c == '+') {
            sign = 1;
            i++;
        }
        int intAbsHigh = 214748364;
        int result = 0;
        while (i < n && chars[i] >= '0' && chars[i] <= '9') {
            int d = chars[i] - '0';
            if (result > intAbsHigh) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            if (result == intAbsHigh) {
                if ((sign == 1) && (d > 7)) {
                    return Integer.MAX_VALUE;
                }
                if ((sign == -1) && (d > 8)) {
                    return Integer.MIN_VALUE;
                }
            }
            result = result * 10 + d;
            i++;
        }
        return sign * result;
    }

    public static void main(String[] args) {
        System.out.println(strToInt("  +-+-123"));
    }
}
