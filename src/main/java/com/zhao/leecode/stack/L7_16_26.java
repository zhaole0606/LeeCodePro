package com.zhao.leecode.stack;

/**
 * 面试题 16.26. 计算器
 * https://leetcode-cn.com/problems/calculator-lcci/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 8:59 上午
 */


import java.util.Stack;

/**
 * 解题思路:使用两个栈，一个栈存放数字，一个栈存放运算符(限于加减)
 */
public class L7_16_26 {
    public static int calculate(String s) {
        Stack<Integer> characters = new Stack();//数字
        Stack<Character> symbol = new Stack();//计算符号
        int index = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c == ' ') {
                index++;
                continue;
            } else if (isNum(c)) {
                int _c = c - '0';
                index++;
                //查看下一个字符是否是数字
                while (index < s.length() && isNum(s.charAt(index))) {
                    _c = _c * 10 + s.charAt(index) - '0';
                    index++;
                }
                characters.push(_c);
            } else {
                if (symbol.isEmpty() || isCal(c, symbol.peek())) {
                    symbol.push(c);
                } else {
                    //判断当前操作符和 上一个操作符
                    //计算操作符等级高的
                    while (!symbol.isEmpty() && !isCal(c, symbol.peek())) {
                        fetchAndCal(characters, symbol);
                    }
                    symbol.push(c);
                }
                index++;
            }
        }

        while (!symbol.isEmpty()) {
            fetchAndCal(characters, symbol);
        }
        return characters.pop();
    }


    private static boolean isCal(char a, char b) {
        if ((a == '*' || a == '/') && (b == '+' || b == '-')) {
            return true;
        }
        return false;
    }

    private static boolean isNum(char c) {
        return (c >= '0' && c <= '9') ? true : false;
    }

    private static void fetchAndCal(Stack<Integer> nums, Stack<Character> ops) {
        int number2 = nums.pop();
        int number1 = nums.pop();
        char op = ops.pop();
        int ret = cal(op, number1, number2);
        nums.push(ret);
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

    public static void main(String[] args) {
        System.out.println(calculate("2+3-4+2"));
    }

}
