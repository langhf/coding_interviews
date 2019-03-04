package cn.drelang.q14_cuttingRope;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/04 17:06
 */
public class TestSolution {
    @Test
    public void test() {
        testCase(new Solution1());
        testCase(new Solution2());
    }

    private void testCase(Solution solution) {
        Assert.assertEquals(1, solution.maxProductAfterCutting(2));
        Assert.assertEquals(2, solution.maxProductAfterCutting(3));
        Assert.assertEquals(18, solution.maxProductAfterCutting(8));
    }
}
