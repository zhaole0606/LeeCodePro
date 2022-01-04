package com.zhao.leecode.recursion;

/**
 * 剑指 Offer 16. 数值的整数次方
 * https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/29 4:09 下午
 */
public class L7_Offer_16 {

    public double myPow(double x, int n) {
        if (n >= 0) {
            return rPow(x, n);
        } else {
            return 1 / (rPow(x, -1 * (n + 1)) * x);
        }

    }

    public double rPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double halfPow = rPow(x, n / 2);
        if (n % 2 == 1) {
            return halfPow * halfPow * x;
        } else {
            return halfPow * halfPow;
        }
    }

    public static void main(String[] args) {
        L7_Offer_16 a = new L7_Offer_16();
        System.out.println(a.myPow(2, 2));
    }

}
