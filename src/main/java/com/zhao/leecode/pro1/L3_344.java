package com.zhao.leecode.pro1;


/**
 * 334.反转字符串
 * https://leetcode-cn.com/problems/reverse-string/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:44 下午
 */

/**
 * 解题思路：
 * 1. 数组分成一半，然后两边向中间集中，并且相互交换元素。
 */
public class L3_344 {

    public static void reverseString(char[] s) {
        int halfLen = s.length / 2;
        for (int i = 0; i < halfLen; i++) {
            int leftIndex = i;
            int rightIndex = s.length - i - 1;

            char a = s[leftIndex];
            char b = s[rightIndex];

            s[leftIndex] = b;
            s[rightIndex] = a;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o', '!'};
        reverseString(s);
    }
}
