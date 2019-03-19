package cn.drelang.q47_maxValueOfGifts;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/19 10:30
 */
public class TestSolution {
    @Test
    public void test() {
        int[][] arr = {
                {1, 10, 3, 8},
                {12, 2, 9, 6},
                {5, 7, 4, 11},
                {3, 7, 16, 5},
        };
        Solution solution = new Solution();
        Assert.assertEquals(53, solution.getMaxValue(arr));
        Assert.assertEquals(53, solution.getMaxValueOptimization(arr));
    }
}
