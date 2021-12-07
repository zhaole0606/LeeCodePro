package com.zhao.leecode1.pro2;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 16.11. 跳水板
 * https://leetcode-cn.com/problems/diving-board-lcci/
 *
 * @Author Le Zhao
 * @Date 2021/12/5 8:44 下午
 */
public class L3_16_11 {
    public static int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter};
        }
        //短板和长板的数量
        int shorterNum = k, longerNum = 0, i = 0;
        int[] res = new int[k + 1];

        while (shorterNum >= 0 && longerNum <= k) {
            res[i++] = shorterNum * shorter + longerNum * longer;
            shorterNum--;
            longerNum++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(divingBoard(1, 1, 1000000));
    }
}
