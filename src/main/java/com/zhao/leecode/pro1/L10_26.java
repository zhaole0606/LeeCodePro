package com.zhao.leecode.pro1;

/**
 * 26. 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *
 * @Author Le Zhao
 * @Date 2021/11/29 10:56 下午
 */

/**
 * 解题思路：快慢指针，让两个数进行比较， 快指针相当于循环中的index， 两个数比较，
 * 不相同同的时候慢指针移动，
 */
public class L10_26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int t = 0;
        for (int i = 1; i < nums.length; i++) {
            int a = nums[t];
            int b = nums[i];
            if (a != b) {
                nums[t + 1] = nums[i];
                t++;
            }
        }
        return t + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
