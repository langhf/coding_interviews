package cn.drelang.q62_lastNumberInCircle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/30 16:52
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.LastRemaining_Solution(5, 3));
        Assert.assertEquals(0, solution.LastRemaining_Solution(5, 4));

        Assert.assertEquals(3, solution.LastRemaining(5, 3));
        Assert.assertEquals(0, solution.LastRemaining(5, 4));
    }
}
