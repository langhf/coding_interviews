package cn.drelang.q10_1_fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/03 14:21
 */
public class TestSolution
{
    @Test
    public void test() {
        testCase(new Solution1());
        testCase(new Solution2());
    }

    private void testCase(Solution solution) {
        Assert.assertEquals(0, solution.Fibonacci(0));
        Assert.assertEquals(1,solution.Fibonacci(1));
        Assert.assertEquals(1,solution.Fibonacci(2));
        Assert.assertEquals(8, solution.Fibonacci(6));
        Assert.assertEquals(13, solution.Fibonacci(7));
    }
}
