package com.zhao.leecode1.pro2;

/**
 * 面试题 01.08. 零矩阵
 * https://leetcode-cn.com/problems/zero-matrix-lcci/
 *
 * @Author Le Zhao
 * @Date 2021/12/5 8:42 下午
 */
public class L1_01_08 {
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int segment = matrix[i][j];
                if (segment == 0) {
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);
    }
}
