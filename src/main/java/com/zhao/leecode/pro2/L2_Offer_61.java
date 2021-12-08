package com.zhao.leecode.pro2;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 61. 扑克牌中的顺子
 * https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/
 *
 * @Author Le Zhao
 * @Date 2021/12/5 8:44 下午
 */
public class L2_Offer_61 {
    public static boolean isStraight(int[] nums) {
//        即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
        Set<Integer> set = new HashSet<>();
        int min = 14;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            } else if (set.contains(nums[i])) {
                return false;
            } else {
                set.add(nums[i]);
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i]);
            }
        }
        return max - min < 5;

    }

    public static void main(String[] args) {
        System.out.println(isStraight(new int[]{1, 2, 3, 4, 5}));
    }
}
