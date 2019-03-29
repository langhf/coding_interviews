package cn.drelang.q53_2_missingNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/29 10:46
 */
public class TestSolution {
    @Test
    public void test() {
        int[] arr = {0,1,2,3,4,6,7,8};
        int[] arr1 = {0,1,3};
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.getMissingNumber(null));
        Assert.assertEquals(5, solution.getMissingNumber(arr));
        Assert.assertEquals(2, solution.getMissingNumber(arr1));
    }
}
