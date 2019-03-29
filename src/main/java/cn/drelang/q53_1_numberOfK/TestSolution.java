package cn.drelang.q53_1_numberOfK;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/23 19:41
 */
public class TestSolution {
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4, 4, 5, 6, 7, 8, 8, 8, 9, 10};
        int[] arr1 = {1, 2, 3, 3, 3, 3};
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.GetNumberOfK(null, -1));
        Assert.assertEquals(0, solution.GetNumberOfK(arr,100));
        Assert.assertEquals(4, solution.GetNumberOfK(arr, 3));
        Assert.assertEquals(4, solution.GetNumberOfK(arr1, 3));
    }
}
