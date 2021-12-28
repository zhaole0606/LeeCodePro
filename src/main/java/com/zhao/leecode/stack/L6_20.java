package com.zhao.leecode.stack;

import java.util.*;

/**
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 8:58 上午
 */

/**
 * 解题思路：利用栈，类似于消消乐，按顺序将数组循环入栈。预先建立好括号映射关系(注意key value所对应的括号)。
 * 优先放[ ( { 入栈，如果遇到了 } ) ]则需要判断栈中前一个字符是否跟他是一对。最后如果栈为空 则说明全部匹配上
 */
public class L6_20 {
    //([]}
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Deque<Character> stack = new LinkedList<>();

        Map<Character, Character> symbolMap = new HashMap<>();
        symbolMap.put('}', '{');
        symbolMap.put(']', '[');
        symbolMap.put(')', '(');

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (symbolMap.containsKey(ch)) {
                if (stack.isEmpty() || !symbolMap.get(ch).equals(stack.peek())) {
                    return false;
                }
                char before = stack.peek();
                if (symbolMap.get(ch) == before) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }
        return stack.isEmpty();

    }

    public boolean isValid2(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char popC = stack.pop();
                if (c == ')' && popC != '(') {
                    return false;
                }
                if (c == ']' && popC != '[') {
                    return false;
                }
                if (c == '}' && popC != '{') {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        L6_20 stack = new L6_20();
        System.out.println(stack.isValid2("[(({})}]"));
    }
}
