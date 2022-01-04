package com.zhao.leecode.recursion;

/**
 * 三步问题
 * https://leetcode-cn.com/problems/three-steps-problem-lcci/
 *
 * @Author Le Zhao
 * @Date 2021/12/29 4:07 下午
 */

/**
 * 1->1
 * 2->2
 * 3->4
 * 4->7
 * 5->13
 * ...
 */

/**
 * 解题思路：解法同前面，但是要注意的是n的范围，用递归效率会极差，后续会优化。
 */
public class L3_08_01 {
    final int mod = 1000000007;
    int[] memo;

    public int waysToStep(int n) {
        memo = new int[n + 1];
        return waysToStep_r(n);
    }

    public int waysToStep_r(int n) {
        if (n <= 2) {
            return n;
        }
        if (n == 3) {
            return 4;
        }

        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = ((waysToStep_r(n - 1) + waysToStep_r(n - 2)) % mod + waysToStep_r(n - 3)) % mod;
        return memo[n];
    }

    public static void main(String[] args) {
        L3_08_01 a = new L3_08_01();
        System.out.println(a.waysToStep(61));
    }
}
