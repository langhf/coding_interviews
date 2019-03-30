package cn.drelang.q63_maxProfit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/30 18:52
 */
public class TestSolution {
    @Test
    public void test() {
        int[] arr = {9, 11, 8, 5, 7, 12, 16, 14};
        int[] arr2 = {9, 13, 20, 2, 29};

        Solution solution = new Solution();
        Assert.assertEquals(11, solution.maxDiff(arr));
        Assert.assertEquals(27, solution.maxDiff(arr2));
    }
}
