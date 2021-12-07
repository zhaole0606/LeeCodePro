package com.zhao.leecode1.pro1;


/**
 * 1108.反转字符串
 * https://leetcode-cn.com/problems/reverse-string/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:44 下午
 */
public class L3_344 {

    public static void reverseString(char[] s) {
        int lenHalf = s.length / 2;
        for (int i = 0; i < lenHalf; i++) {
            int leftIndex = i;
            int rightIndex = s.length - i - 1;

            char a = s[leftIndex];
            char b = s[rightIndex];

            s[leftIndex] = b;
            s[rightIndex] = a;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o','!'};
        reverseString(s);
    }
}
