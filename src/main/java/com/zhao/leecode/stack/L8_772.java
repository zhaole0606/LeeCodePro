package com.zhao.leecode.stack;

import java.util.Stack;

/**
 * 772. 基本计算器 III
 * https://leetcode-cn.com/problems/basic-calculator-iii/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 8:59 上午
 */
public class L8_772 {
    public static int calculate(String s) {
        Stack<Character> sym = new Stack<>();
        Stack<Integer> nums = new Stack<>();

        int idx = 0;

        while (idx < s.length()) {
            char c = s.charAt(idx);
            if (c == ' ') {
                idx++;
            } else if (isNum(c)) {
                //判断是否是否下个c也是数据
                int number = 0;
                while (idx < s.length() && isNum(s.charAt(idx))) {
                    number = number * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                nums.push(number);
            } else {
                //符号
                if (c == '(') {
                    sym.push(c);
                } else if (c == ')') {
                    //开始计算括号中的表达式
                    while (sym.peek() != '(') {
                        popAndCal(nums, sym);
                    }
                    sym.pop();
                } else if (sym.isEmpty() || isValid(c, sym.peek()) || sym.peek() == '(') {
                    sym.push(c);
                } else {
                    while (!sym.isEmpty() && !isValid(c, sym.peek()) && sym.peek() != '(') {
                        popAndCal(nums, sym);
                    }
                    sym.push(c);
                }
                idx++;
            }
        }
        while (!sym.isEmpty()) {
            popAndCal(nums, sym);
        }

        return nums.pop();
    }

    public static void main(String[] args) {
        System.out.println(calculate("1+(2+3*4)-5"));
    }

    private static void popAndCal(Stack<Integer> nums, Stack<Character> sym) {
        int a = nums.pop();
        int b = nums.pop();
        char op = sym.pop();
        int r = cal(op, b, a);
        nums.push(r);
    }

    private static int cal(char op, int a, int b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return -1;
    }

    private static boolean isValid(char a, char b) {
        if ((a == '*' || a == '/') && (b == '+' || b == '-')) {
            return true;
        }
        return false;
    }

    private static boolean isNum(char c) {
        if (c <= '9' && c >= '0') {
            return true;
        }
        return false;
    }

}
