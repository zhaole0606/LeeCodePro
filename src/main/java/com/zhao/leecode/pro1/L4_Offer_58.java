package com.zhao.leecode.pro1;

/**
 * 125. 验证回文串
 * https://leetcode-cn.com/problems/valid-palindrome/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:44 下午
 */
public class L4_Offer_58 {
    public static boolean isPalindrome(String s) {
        String[] strArr = s.split("");
        StringBuffer content = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            //忽略大小写 忽略空格
            char str = strArr[i].toLowerCase().charAt(0);
            if (str == ' ') {
                continue;
            }
            //只考虑字母和数字字符
            if ((str >= 'a' && str <= 'z') || (str >= '0' && str <= '9')) {
                content.append(str);
            }
        }
        String r = content.toString();
        int lenHalf = r.length() / 2;
        char[] strChar = r.toCharArray();
        for (int i = 0; i < lenHalf; i++) {
            int leftIndex = i;
            int rightIndex = r.length() - i - 1;

            char a = strChar[leftIndex];
            char b = strChar[rightIndex];

            if (a != b) {
                return false;
            }

            strChar[leftIndex] = b;
            strChar[rightIndex] = a;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
