package com.zhao.leecode.pro1;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 * https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:44 下午
 */

/**
 * 结题思路：
 * 1。split之后，进行字符串拼接，手动添加空格。
 * 2. 整个输入进行反转，再将每个单词进行反转 如：abc def->  fed cba -> def abc
 */
public class L4_Offer_58 {
    public static String reverseWords(String s) {
        StringBuffer stringBuffer = new StringBuffer();

        String[] strs = s.split(" ");
        for (int i = strs.length - 1; i >= 0; i--) {
            if ("".equals(strs[i])) {
                continue;
            }
            stringBuffer.append(strs[i]).append(" ");
        }
        return stringBuffer.toString().trim();
    }

    public static void main(String[] args) {
        String a = reverseWords("");
        System.out.println(a);
    }
}
