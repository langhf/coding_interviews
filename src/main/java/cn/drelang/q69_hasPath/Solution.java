package cn.drelang.q69_hasPath;

import org.junit.Assert;

/**
 *
 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。
 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占
 据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 * Created by Drelang on 2019/06/11 15:09
 */


public class Solution {

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (matrix == null || rows < 1 || cols < 1 || str == null)
            return false;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (matrix[i*cols+j] == str[0]) {    // 在矩阵中寻找
                    boolean[] arr = new boolean[rows*cols];
                    if (hasPath(matrix, rows, cols, i, j, str, 0, arr))  // 若找到，则返回
                        return true;
                }
            }
        }

        return false;
    }

    private static boolean hasPath(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, boolean[] arr) {
        if (k >= str.length || (k == str.length-1 && matrix[i*cols+j] == str[k]))
            return true;

        if (matrix[i*cols+j] != str[k])    // 判断矩阵当前元素是否与字符串当前元素相等，若相等，则递归判断之后的元素。
            return false;

        arr[i*cols+j] = true;  // 走过 i,j 这一坐标，则标记为已经走过。

        boolean left = false, right = false, up = false, down = false;
        if (j>0 && !arr[i*cols+j-1])
            left = hasPath(matrix, rows, cols, i, j-1, str, k+1, arr);
        if (j<cols-1 && !arr[i*cols+j+1])
            right = hasPath(matrix, rows, cols, i, j+1, str, k+1, arr);
        if (i>0 && !arr[(i-1)*cols+j])
            up = hasPath(matrix, rows, cols, i-1, j, str, k+1, arr);
        if (i<rows-1 && !arr[(i+1)*cols+j])
            down = hasPath(matrix, rows, cols, i+1, j, str, k+1, arr);

        return left || right || up || down;
    }

    public static void main(String[] args) {
        char[] matrix = { 'A', 'A','A','A','A','A','A','A', 'A','A','A','A'};
        int rows = 3, cols = 4;
        char[] str = { 'A', 'A','A','A','A','A','A','A', 'A','A','A','A'};
        Assert.assertTrue(hasPath(matrix, rows, cols, str));

    }
}
