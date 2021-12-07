package com.zhao.leecode1.pro1;


/**
 * 1.两数之和
 * https://leetcode-cn.com/problems/two-sum/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:39 下午
 */

/**
 * 只能想到穷举 循环判断。
 */
public class L1_1 {
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int first = nums[i];
                int second = nums[j];
                if (i == j) {
                    continue;
                }
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
