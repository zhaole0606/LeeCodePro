package com.zhao.leecode.stack;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 8:54 上午
 */

/**
 * 解题思路：
 */
public class L1_Offer_09 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public L1_Offer_09() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            return -1;
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int res = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return res;
    }

    public static void main(String[] args) {
        L1_Offer_09 a = new L1_Offer_09();
        a.appendTail(4);
        a.appendTail(3);
        a.appendTail(2);
        a.appendTail(1);
        a.deleteHead();
        a.deleteHead();
        a.appendTail(10);
        a.deleteHead();
    }
}
