package cn.drelang.q31_stackPushPopOrder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/09 17:15
 */
public class TestSolution {
    @Test
    public void test() {
        int[] pushA = {1, 2, 3, 4, 5};
        int[] popA = {4, 5, 3, 2, 1};
        int[] popA2 = {4, 3, 5, 1, 2};
        Solution solution = new Solution();
        Assert.assertTrue(solution.IsPopOrder(pushA, popA));
        Assert.assertFalse(solution.IsPopOrder(pushA, popA2));
    }
}
