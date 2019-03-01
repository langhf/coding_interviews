package cn.drelang.q2_findDuplication;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/01 21:27
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution1 = new Solution1();
        testCase(solution1);
        Solution solution2 = new Solution2();
        testCase(solution2);
    }

    private void testCase(Solution solution) {
        int[] nums1 = {2, 3, 1, 0, 2, 5, 3};
        int[] nums2 = {2, 7, 1, 0, 2, 5, 3};
        int[] nums3 = {2, 3, 4, 1, 0, 5, 6};
        int[] nums4 = null;
        Assert.assertTrue(solution.duplicate(nums1));
        Assert.assertFalse(solution.duplicate(nums2));
        Assert.assertFalse(solution.duplicate(nums3));
        Assert.assertFalse(solution.duplicate(nums4));
    }
}
