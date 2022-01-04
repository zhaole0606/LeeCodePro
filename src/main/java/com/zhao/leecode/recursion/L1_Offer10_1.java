package com.zhao.leecode.recursion;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/29 4:06 下午
 */

/**
 * 解题思路：递归在leecode中会超时，所以递归方式就完成结果来说是不可行的,所以增加备忘录方式，记录已经计算过的数值
 */
public class L1_Offer10_1 {
    private int[] memo;
    final int mod = 1000000007;

    public int fib(int n) {
        memo = new int[n + 1];
        return fib_r(n);
    }

    public int fib_r(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = (fib_r(n - 1) + fib_r(n - 2)) % mod;
        return memo[n];
    }

    public static void main(String[] args) {
        L1_Offer10_1 a = new L1_Offer10_1();
        int fib = a.fib(2);
        System.out.printf(fib + "");
    }
}
