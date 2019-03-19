package cn.drelang.q49_uglyNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/19 13:08
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.GetUglyNumber_Solution(-1));
        Assert.assertEquals(1, solution.GetUglyNumber_Solution(1));
        Assert.assertEquals(4, solution.GetUglyNumber_Solution(4));
    }
}
