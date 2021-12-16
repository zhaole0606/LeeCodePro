package com.zhao.leecode.pro1;

/**
 * 58. 最后一个单词的长度
 * https://leetcode-cn.com/problems/length-of-last-word/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:52 下午
 */

/**
 * 解题思路：
 * 倒叙判断，并且要验证当前字符下一个字符是否为空
 */
public class L7_58 {
    public static int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            len++;
            if ((i - 1 > 0) && s.charAt(i - 1) == ' ') {
                break;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
}
