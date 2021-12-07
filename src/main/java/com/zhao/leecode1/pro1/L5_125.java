package com.zhao.leecode1.pro1;

/**
 * 剑指 Offer 58 - I. 翻转单词顺序
 * https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:44 下午
 */
public class L5_125 {
    public static String reverseWords(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        //单词反转
        // 单词之间的多个空格按照一个来看
        //句首，句尾有空格 翻转后过滤
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
