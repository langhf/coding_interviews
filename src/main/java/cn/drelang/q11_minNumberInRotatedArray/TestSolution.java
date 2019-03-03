package cn.drelang.q11_minNumberInRotatedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/03 20:47
 */
public class TestSolution {
    @Test
    public void test() {
        int[] a1 = {};
        int[] a2 = {4, 5, 1, 2, 3};
        int[] a3 = {1, 2, 3, 4, 5};
        int[] a4 = {5, 4, 3, 2, 1};

        Solution solution = new Solution();
        Assert.assertEquals(0, solution.minNumberInRotateArray(null));
        Assert.assertEquals(0, solution.minNumberInRotateArray(a1));
        Assert.assertEquals(1, solution.minNumberInRotateArray(a2));
        Assert.assertEquals(1, solution.minNumberInRotateArray(a3));
        Assert.assertEquals(1, solution.minNumberInRotateArray(a4));
    }
}
