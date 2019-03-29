package cn.drelang.q53_3_integerIdenticalToIndex;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/29 10:58
 */
public class TestSolution {
    @Test
    public void test() {
        int[] arr = {-3, -1, 1, 3, 5};
        int[] arr1 = {-3, -1, 1, 4, 5};
        int[] arr2 = {0, 2, 3, 4};
        int[] arr3 = {-1, 0, 1, 3};
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.getNumberSameAsIndex(null));
        Assert.assertEquals(3, solution.getNumberSameAsIndex(arr));
        Assert.assertEquals(-1, solution.getNumberSameAsIndex(arr1));
        Assert.assertEquals(0, solution.getNumberSameAsIndex(arr2));
        Assert.assertEquals(3, solution.getNumberSameAsIndex(arr3));
    }
}
