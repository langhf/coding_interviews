package cn.drelang.q56_2_numberAppearingOnce;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/29 16:23
 */
public class TestSolution {
    @Test
    public void test() {
        int[] arr1 = {4, 4, 1, 1, 1, 7, 4};
        int[] arr2 = {3, 3, 3, 4, 7, 7, 7};

        Solution solution = new Solution();
        Assert.assertEquals(7, solution.findNumberAppearingOnce(arr1));
        Assert.assertEquals(4, solution.findNumberAppearingOnce(arr2));
        Assert.assertEquals(-1, solution.findNumberAppearingOnce(null));
    }
}
