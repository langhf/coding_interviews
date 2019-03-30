package cn.drelang.q61_continuousCards;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/30 15:23
 */
public class TestSolution {
    @Test
    public void test() {
        int[] arr = {0, 0, 0, 0, 0};
        int[] arr2 = {0,1,3,4,5};
        int[] arr3 = {0,1,4,5,6};

        Solution solution = new Solution();
        Assert.assertTrue(solution.isContinuous(arr));
        Assert.assertTrue(solution.isContinuous(arr2));
        Assert.assertFalse(solution.isContinuous(arr3));
    }
}
