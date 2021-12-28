package com.zhao.leecode.stack;

import java.util.Stack;

/**
 * 42. 接雨水
 * https://leetcode-cn.com/problems/trapping-rain-water/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 9:02 上午
 */
public class L12_42 {
    public static int trap(int[] height) {
        int sum = 0;
        int idx = 0;
        //单调栈 记录从大到小的数据
        Stack<Integer> idxSstack = new Stack<>();
        while (idx < height.length) {
            int n = height[idx];
            if (idx == 0 && n == 0) {
                idx++;
                continue;
            }
            //当前的数值 = 栈中的数据。
            if (!idxSstack.isEmpty()) {
                //当前的数值 = 栈中的数据。
                if (height[idxSstack.peek()] == n) {
                    idx++;
                    continue;
                    //当前的数值 > 栈中的数据。
                } else if (height[idxSstack.peek()] < n) {
                    //栈中序列
                    int sIdx = idxSstack.pop();
                    //当前的idx - 栈中idx
                    int m = idx - sIdx;
                    //当前的值 - 栈中idx对应的值
                    int l = n - height[sIdx];
                    sum += (m * l);
                }
            }
            idxSstack.push(idx);
            idx++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(a));
    }
}
