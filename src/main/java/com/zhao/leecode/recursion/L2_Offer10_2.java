package com.zhao.leecode.recursion;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/29 4:06 下午
 */

/**
 * 同上一题结题思路
 */
public class L2_Offer10_2 {
    final int mod = 1000000007;
    int[] memo;

    public int numWays(int n) {
        memo = new int[n + 1];
        return numWays_r(n);
    }

    public int numWays_r(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 2) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = (numWays_r(n - 1) + numWays_r(n - 2)) % mod;
        return memo[n];
    }

    public static void main(String[] args) {
        L2_Offer10_2 a = new L2_Offer10_2();
        a.numWays(5);
    }
}
