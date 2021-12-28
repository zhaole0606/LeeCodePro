package com.zhao.leecode.stack;
import java.util.Stack;

/**
 * 1047. 删除字符串中的所有相邻重复项
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 9:00 上午
 */

/**
 * 解题思路：用栈记录不能消除的元素。
 */
public class L9_1047 {
    public String removeDuplicates1(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //第一次为空或者全部消除完为空
            if (stack.isEmpty()) {
                stringBuffer.append(c);
                stack.add(c);
                continue;
            }
            //每次入栈 都对栈中上一个元素进行判断。
            while (stack.peek() != null) {
                if (stack.peek() == c) {
                    stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    stack.pop();
                    break;
                } else {
                    stack.push(c);
                    stringBuffer.append(c);
                    break;
                }
            }
        }
        return stringBuffer.toString();
    }

    public String removeDuplicates2(String s) {
        return null;
    }

    public static void main(String[] args) {
        L9_1047 a = new L9_1047();
        System.out.println(a.removeDuplicates1("abbbbaca"));
    }
}
