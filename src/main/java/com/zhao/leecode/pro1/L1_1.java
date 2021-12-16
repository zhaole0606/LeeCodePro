package com.zhao.leecode.pro1;


/**
 * 1.两数之和
 * https://leetcode-cn.com/problems/two-sum/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:39 下午
 */

/**
 * 解题思路：
 * 1. 使用暴力穷举，双层for循环，注意内存循环要比外层循环起始位置大，从而避免有重复组合。
 */
public class L1_1 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            //j  的下标要比i 大，避免有重复组合
            for (int j = i + 1; j < nums.length; j++) {
                int first = nums[i];
                int second = nums[j];

                if (first + second == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{-3, 4, 3, 90
        }, 0));
    }
}
