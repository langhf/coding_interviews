package cn.drelang.q13_robotMove;

/**
 * 问题:
 *   地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移
 *   动，每一次只能向左，右，上，下四个方向移动一格，但是不能进
 *   入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机
 *   器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能
 *   进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到
 *   多少个格子？
 *
 * 解法:
 *   回溯法。
 *
 * Created by Drelang on 2019/03/04 15:35
 */
class Solution {
    private int threshold;
    private int rows;
    private int cols;
    private boolean[] visited;

    int movingCount(int threshold, int rows, int cols) {
        if(rows <= 0 || cols <= 0 || threshold <= 0) return 0;
        // 构建一个布尔矩阵，用来标识路径是否已经进入了每个格子
        boolean[] visited = new boolean[rows*cols];
        this.threshold = threshold;
        this.rows = rows;
        this.cols = cols;
        this.visited = visited;
        // 启动主程序
        return movingCountCore(0, 0);
    }

    private int movingCountCore(int row, int col) {
        int count = 0;
        if(check(row, col)) {
            visited[row*cols+col] = true;
            count = 1 +
                    movingCountCore(row + 1, col) +
                    movingCountCore(row - 1, col) +
                    movingCountCore(row, col + 1) +
                    movingCountCore(row, col - 1);
        }
        return count;
    }

    // 检查当前格子是否合法
    private boolean check(int row, int col) {
        return row >= 0 && row < rows &&
                      col >= 0 && col < cols &&
                     getSum(row, col) <= threshold &&
                     !visited[row*cols+col];
    }

    private int getSum(int row, int col) {
        int sum=0;
        while(row != 0) {
            sum += row % 10;
            row /= 10;
        }
        while(col != 0) {
            sum += col % 10;
            col /= 10;
        }
        return sum;
    }
}
