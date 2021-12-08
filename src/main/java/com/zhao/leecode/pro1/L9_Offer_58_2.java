package com.zhao.leecode.pro1;

/**
 * 剑指 Offer 58 - II. 左旋转字符串
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:55 下午
 */


/**
 * 结题思路：
 * 循环字符串，从需要旋转位置的下一个字符开始循环，等循环完毕，在将指针从头开始，
 * 这样就是将首位的n位数字旋转到末尾。（方法粗糙 有优化空间）
 */
public class L9_Offer_58_2 {
    public static String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        int start = n;
        while (start < chars.length) {
            stringBuffer.append(chars[start]);
            start++;
            if (start == chars.length) {
                start = 0;
            }
            if (n == start) {
                break;
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 6));
    }
}
