package cn.drelang.q47_maxValueOfGifts;

/**
 * 问题：礼物的最大价值
 *      在一个m×n的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值
 *     （价值大于0）。你可以从棋盘的左上角开始拿格子里的礼物，并每次向左或
 *      者向下移动一格直到到达棋盘的右下角。给定一个棋盘及其上面的礼物，请计
 *      算你最多能拿到多少价值的礼物？
 *
 *  解法：
 *      动态规划
 *      f(i,j) = arr[i,j] + max(f(i-1,j), f(i,j-1))
 *
 * Created by Drelang on 2019/03/19 09:04
 */
class Solution {
    int getMaxValue(int[][] arr) {
        if (arr == null || arr.length < 1)
            return 0;
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] maxValues = new int[rows][cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                int left = 0;
                int up = 0;
                if (i > 0)
                    up = maxValues[i-1][j];
                if (j > 0)
                    left = maxValues[i][j-1];
                maxValues[i][j] = arr[i][j] + Math.max(left, up);
            }
        }
        return maxValues[rows-1][cols-1];
    }

    /**
     *  用一维矩阵保存最大值
      * 对于节点(i,j)，数组下标j之前保存该行前面的j个，0, 1, .. , j-1，后面的保存上一行的后 j, j+1, ... n-1 个
      * 如图:
     *                                       f(i-1, j) , f(i-1,j+1), ... , f(i-1, n)
     *  f(i,0), f(i,1) .... f(i,j-1), f(i, j)
     */
    int getMaxValueOptimization(int[][] arr) {
        if (arr == null || arr.length < 1)
            return 0;
        int rows = arr.length;
        int cols = arr[0].length;
        int[] maxValues = new int[cols];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                int up = 0;
                int left = 0;
                if (i>0)
                    up = maxValues[j];
                if (j>0)
                    left = maxValues[j-1];
                maxValues[j] = arr[i][j] + Math.max(left, up);
            }
        }
        return maxValues[cols-1];
    }
}
