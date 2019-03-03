package cn.drelang.q04_findIn2DArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/02 14:55
 */
public class TestSolution {
    @Test
    public void test() {
        int[][] nums = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        int[][] empty = {{}};

        Solution solution = new Solution();
        Assert.assertTrue(solution.find(nums, 7));
        Assert.assertTrue(solution.find(nums, 15));
        Assert.assertTrue(solution.find(nums, 1));
        Assert.assertFalse(solution.find(nums, -3));
        Assert.assertFalse(solution.find(nums, 20));
        Assert.assertFalse(solution.find(null, 2));
        Assert.assertFalse(solution.find(empty, 3));
    }
}
