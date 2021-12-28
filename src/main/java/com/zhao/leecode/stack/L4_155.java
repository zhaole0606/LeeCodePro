package com.zhao.leecode.stack;

import java.util.Stack;

/**
 * 155. 最小栈
 * https://leetcode-cn.com/problems/min-stack/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 8:56 上午
 */

/**
 * 解题思路：建立一个最小栈minStack和一个普通栈，普通栈存储push的数值，最小栈存储的是 Min(当时的数值,最小栈中的数值)
 */
public class L4_155 {
    private Stack<Integer> minStack;
    private Stack<Integer> stack;

    public L4_155() {
        minStack = new Stack<>();
        stack = new Stack<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        minStack.push(minStack.peek() < val ? minStack.peek() : val);

    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
