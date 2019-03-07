package cn.drelang.q29_printMatrix;

import org.junit.Test;

/**
 * Created by Drelang on 2019/03/07 20:16
 */
public class TestSolution {
    @Test
    public void test() {
        int[][] matrix = {
                {1,    2,    3,    4,    5},
                {14, 15, 16,  17,   6},
                {13, 20, 19,  18,   7},
                { 12,11, 10,   9,    8}
        };

        int[][] matrix2 = {
                {1, 2, 3, 4, 5}
        };

        int[][] matrix3 = {
                {1},
                {2},
                {3},
                {4},
                {5}
        };

        int[][] matrix4 = {
                {1,    2,    3,    4,   5},
                {10,  9,    8,    7,   6},
        };

        System.out.println(new Solution().printMatrix(matrix));
        System.out.println(new Solution().printMatrix(matrix2));
        System.out.println(new Solution().printMatrix(matrix3));
        System.out.println(new Solution().printMatrix(matrix4));
    }
}
