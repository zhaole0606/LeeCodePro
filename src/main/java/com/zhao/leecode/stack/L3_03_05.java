package com.zhao.leecode.stack;

import java.util.Stack;

/**
 * 面试题 03.05. 栈排序
 * https://leetcode-cn.com/problems/sort-of-stacks-lcci/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 8:56 上午
 */

/**
 * 解题思路：入栈的时候对数据进行排序（单调栈）临时栈用来存储 小于当前val的 ，等将val存到栈中再把临时栈的数据读回去。
 */
public class L3_03_05 {

    private Stack<Integer> stack;
    private Stack<Integer> tmpStack;

    public L3_03_05() {
        stack = new Stack<>();
        tmpStack = new Stack<>();
    }

    public void push(int val) {
        while (!stack.isEmpty()) {
            int qVal = stack.peek();
            if (qVal < val) {
                tmpStack.add(qVal);
                stack.pop();
            } else {
                break;
            }
        }
        stack.add(val);
        while (!tmpStack.isEmpty()) {
            stack.add(tmpStack.pop());
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int peek() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        L3_03_05 queue = new L3_03_05();
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(1);
        queue.push(3);
        queue.push(2);
        queue.push(4);
        System.out.println(queue);
    }

}
