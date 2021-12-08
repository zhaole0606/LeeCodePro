package com.zhao.leecode.pro1;

/**
 * 9. 回文数
 * https://leetcode-cn.com/problems/palindrome-number/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:50 下午
 */

/**
 * 结题思路：
 * 1.先获取这个输入数字x的长度，利用循环分别对 第一个数字和最后一个数字比较。每次比较完毕后如果无异常 则减去头尾数更新x本体 继续下次循环
 * 2.将输入数字变成字符串数组 进行判断。
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
            //高位数
            int first = x / pow_nnum;
            //尾数
            int second = x % 10;

            if (first != second) {
                return false;
            }
            //每次比较完 减去头和尾
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
