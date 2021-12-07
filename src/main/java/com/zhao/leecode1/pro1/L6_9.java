package com.zhao.leecode1.pro1;

/**
 * 9. 回文数
 * https://leetcode-cn.com/problems/palindrome-number/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:50 下午
 */

/**
 * 结题思路： 先获取这个数字的长度，再前后指针分别比对。  每次循环，数字的主体都要变化。
 */
public class L6_9 {
    public static boolean isPalindrome(int x) {
        int _x = x;
        if (_x < 0) {
            return false;
        }
        int len = 0;
        while (_x > 0) {
            _x = _x / 10;
            len++;
        }
        int pow_nnum = (int) Math.pow(10, len - 1);

        while (pow_nnum > 0) {
            int first = x / pow_nnum;
            int second = x % 10;
            if (first != second) {
                return false;
            }
            x = (x - first * pow_nnum) / 10;
            pow_nnum /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
//        System.out.println(443 / 10);
    }


}
