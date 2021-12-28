package com.zhao.leecode.stack;

import java.util.Stack;

/**
 * 739. 每日温度
 * https://leetcode-cn.com/problems/daily-temperatures/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 9:02 上午
 */

/**
 * 解题思路：
 * 1。暴力循环解决问题
 * 2. 单调栈(解决难度略大)，单调降序栈（下到上），只有当前数比上一个数大则记录当前数据的序列号。
 */
public class L11_739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int[] rest = new int[len];

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int idx = stack.peek();
                rest[idx] = i - idx;
                stack.pop();
            }
            stack.push(i);
        }
        return rest;
    }

    public static void main(String[] args) {
        int[] t = {73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(t);
    }
}
