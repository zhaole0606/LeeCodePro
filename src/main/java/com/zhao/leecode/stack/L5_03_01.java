package com.zhao.leecode.stack;

/**
 * 面试题 03.01. 三合一
 * https://leetcode-cn.com/problems/three-in-one-lcci/
 *
 * @Author Le Zhao
 * @Date 2021/12/16 8:57 上午
 */

/**
 * 解题思路：建立一个数组用来存储三个栈中的深度(从0开始)，剩下的就是注意边界问题。
 */
public class L5_03_01 {
    int[] a;
    int[] indexArr;
    int stackSize;

    public L5_03_01(int stackSize) {
        a = new int[stackSize * 3];
        indexArr = new int[]{-1, -1, -1};
        this.stackSize = stackSize;
    }

    public void push(int stackNum, int value) {
        //使用堆栈的序列
        //查看指定stack中的深度
        int deep = indexArr[stackNum];
        if (deep >= this.stackSize - 1) {
            return;
        }
        ++deep;
        a[this.stackSize * stackNum + deep] = value;
        indexArr[stackNum] = deep;

    }

    public int pop(int stackNum) {
        int deep = indexArr[stackNum];
        if (deep < 0) {
            return -1;
        }
        int val = a[this.stackSize * stackNum + deep];
        --deep;
        indexArr[stackNum] = deep;
        return val;
    }

    public int peek(int stackNum) {
        int deep = indexArr[stackNum];
        if (deep < 0) {
            return -1;
        }
        return a[this.stackSize * stackNum + deep];
    }

    public boolean isEmpty(int stackNum) {
        int deep = indexArr[stackNum];
        return deep < 0 ? true : false;
    }

    public static void main(String[] args) {
        L5_03_01 array = new L5_03_01(1);
        array.push(0, 1);
        array.push(0, 2);
        array.pop(0);
        array.pop(0);
        array.pop(0);
    }
}
