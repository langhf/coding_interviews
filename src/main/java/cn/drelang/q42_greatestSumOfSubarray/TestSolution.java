package cn.drelang.q42_greatestSumOfSubarray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/17 11:36
 */
public class TestSolution {
    @Test
    public void test() {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        int[] nums1 = {1, -2, 3, 10, -4, 7, 2, -5};
        Assert.assertEquals(18, solution1.FindGreatestSumOfSubArray(nums1));
        Assert.assertEquals(18, solution2.FindGreatestSumOfSubArray(nums1));
    }
}
