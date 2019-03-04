package cn.drelang.q15_numberOf1InBinary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/04 19:34
 */
public class TestSolution {
    @Test
    public void test() {
        testCase(new Solution1());
        testCase(new Solution2());
    }

    private void testCase(Solution solution) {
        Assert.assertEquals(0, solution.NumberOf1(0));
        Assert.assertEquals(1, solution.NumberOf1(4));
        Assert.assertEquals(1, solution.NumberOf1(0x80000000));
        Assert.assertEquals(32, solution.NumberOf1(0xFFFFFFFF));
        Assert.assertEquals(1, solution.NumberOf1(0x00001000));
    }
}
