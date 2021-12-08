package com.zhao.leecode.pro2;

/**
 * 面试题 01.05. 一次编辑（
 * https://leetcode-cn.com/problems/one-away-lcci/
 *
 * @Author Le Zhao
 * @Date 2021/12/5 8:45 下午
 */
public class L4_01_05 {
    public static boolean oneEditAway(String first, String second) {
        //两个字符串长度超过两次
        int a = first.length() - second.length();
        if (a >= 2 || a <= -2) {
            return false;
        }
        if ((first.length() == second.length()) && (first.length() == 1)) {
            return true;
        }
        String maxStr;
        String minStr;
        if (first.length() > second.length()) {
            maxStr = first;
            minStr = second;
        } else {
            maxStr = second;
            minStr = first;
        }
        int err = 0;
        int j = 0;
        for (int i = 0; i < minStr.length(); i++) {
            if (err == 2) {
                return false;
            }
            char minChar = minStr.charAt(i);
            char maxChar = maxStr.charAt(j);
            if (minChar != maxChar && minStr.length() != maxStr.length()) {
                i--;
                err++;
            } else if (minChar != maxChar) {
                err++;
            }
            j++;
        }
        if (err == 2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("ab", "bc"));
    }
}
