package cn.drelang.q64_accumulate;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/30 19:27
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.Sum_Solution(3));
        Assert.assertEquals(10, solution.Sum_Solution(4));
        Assert.assertEquals(0, solution.Sum_Solution(0));
    }
}
