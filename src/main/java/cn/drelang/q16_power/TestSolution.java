package cn.drelang.q16_power;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/05 10:15
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(4.0, solution.Power(2.0, 2), 0.0);
        Assert.assertEquals(0.0, solution.Power(0.0, 1), 0.0);
        Assert.assertEquals(1.0, solution.Power(1, 0), 0.0);
        Assert.assertEquals(169.0, solution.Power(13.0, 2), 0.0);
        Assert.assertEquals(1024.0, solution.Power(2.0, 10), 0.0);
        Assert.assertEquals(0.125, solution.Power(2.0, -3), 0.0);
    }
}
