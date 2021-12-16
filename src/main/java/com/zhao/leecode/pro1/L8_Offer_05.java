package com.zhao.leecode.pro1;

/**
 * 剑指 Offer 05. 替换空格
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:53 下午
 */

/**
 * 解题思路：
 * 每个字符串循环判断
 */
public class L8_Offer_05 {
    public static String replaceSpace(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char _char = s.charAt(i);
            if (_char == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(_char);
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
