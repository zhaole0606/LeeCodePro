package com.zhao.leecode1.pro2;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 * https://leetcode-cn.com/problems/spiral-matrix/
 *
 * @Author Le Zhao
 * @Date 2021/12/5 8:49 下午
 */
public class L9_54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int _row = row;
        int cel = matrix[0].length;
        int _cel = cel;

        int r_n = 0;
        int c_n = cel - 1;

        int r_res = 0;
        int c_res = 0;
        while (true) {
            //遍历第一行

            r_n++;
            c_n++;
            r_res += (int) Math.pow(-1, r_n + 1) * (_row - r_n);
            c_res += (int) Math.pow(-1, c_n) * (_cel - c_n);

            break;
        }
        return list;
    }

    //读取行数据
    private List<Integer> addRowData(int[][] matrix, List<Integer> list, int row, int cel) {
        while (cel > 0) {
            list.add(matrix[row][cel]);
            cel--;
        }
        return list;
    }

    //读取列数据
    private List<Integer> addCelData(int[][] matrix, List<Integer> list, int row, int cel) {
        while (row > 0) {
            list.add(matrix[row][cel]);
            row--;
        }
        return list;

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix));
    }
}
