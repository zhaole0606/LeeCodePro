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


public class L11_Offer_67 {
    public static int strToInt(String str) {
        char[] chars = str.toCharArray();
        long res = 0;
        int sigin = 1;
        int err = 0;
        for (int i = 0; i < chars.length; i++) {
            char segment = chars[i];
            if (segment == ' ') {
                continue;
            }
            if (err >= 2) {
                return 0;
            }
            //统计不是数字的char
            if (segment > '9' || segment < '0') {
                err++;
            }


            if ((segment != '-' && segment != '+') && (segment > '9' || segment < '0')) {
                break;
            }

            if (err == 1 && segment == '-') {
                sigin = -1;
                continue;
            }
            if (err == 1 && segment == '+') {
                continue;
            }
            res = (res * 10) + (segment - '0');

            if (res == 0) {
                return 0;
            }
            if (sigin == 1 && res >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sigin == -1 && (sigin * res) <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) res * sigin;
    }

    //"   +0 123"
    public static void main(String[] args) {
        System.out.println(strToInt("  +0 123"));
    }
}
