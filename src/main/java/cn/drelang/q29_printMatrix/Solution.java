package cn.drelang.q29_printMatrix;

import java.util.ArrayList;

/**
 * 问题： 顺时针打印矩阵
 *   输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 * 解法：
 *   将问题分解为小问题来解决。
 *   1. 一圈一圈打印，而判断圈打印完的条件是
 *          rows <= 2 * start, && columns <= 2 * start，其中 start 为每一圈
 *          左上角的位置
 *   2. 每一圈打印可以分四步
 *          1. 从左往右，一定可以执行该步；
 *          2. 从上往下，条件是终止行数大于起始行数；
 *          3. 从右往左，在2的基础上，还要终止列数大于起始列数；
 *          4. 从下往上，在3的基础上，需要终止列数比起始列数大2；
 *          注意： 不要重复打印转角点的值！！！
 *
 * Created by Drelang on 2019/03/07 19:50
 */
class Solution {
    private ArrayList<Integer> list = new ArrayList<>();

    ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null) return null;
        int rows = matrix.length;
        if (rows < 1) return null;
        int columns = matrix[0].length;
        int start = 0;
        while(2*start < rows && 2*start < columns) {
            printMatrixInCircle(matrix, rows, columns, start);
            start++;
        }
        return list;
    }

    private void printMatrixInCircle(int[][] matrix, int rows, int columns, int start) {
        int maxRow = rows - start - 1;
        int maxColumn = columns - start - 1;

        for (int i=start; i<=maxColumn; i++) {  // 从左往右
            list.add(matrix[start][i]);
        }

        if (maxRow > start) {   // 从上往下
            for (int i=start+1; i<=maxRow; i++) {
                list.add(matrix[i][maxColumn]);
            }

            if (maxColumn > start) {    // 从右往左
                for (int i=maxColumn-1; i>=start; i--) {
                    list.add(matrix[maxRow][i]);
                }

                if (maxRow > (start + 1)) { // 从下网上
                    for (int i=maxRow-1; i>start; i--) {
                        list.add(matrix[i][start]);
                    }
                }
            }
        }
    }
}
