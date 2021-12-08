package com.zhao.leecode.pro1;

/**
 * 1108. IP 地址无效化
 * https://leetcode-cn.com/problems/defanging-an-ip-address/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:39 下午
 */

/**
 * 结题思路：
 * 1. 分割，循环判断，并且替换
 */
public class L2_1108 {
    public static String defangIPaddr(String address) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] n = address.split("\\.");
        for (int i = 0; i < n.length; i++) {
            stringBuffer.append(n[i]);
            if (i < n.length - 1) {
                stringBuffer.append("[.]");
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
}
