package cn.drelang.q20_isNumeric;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/05 19:26
 */
public class TestSolution {
    @Test
    public void test() {
        testCase(new Solution1());
        testCase(new Solution2());
    }

    private void testCase(Solution solution) {
        Assert.assertTrue(solution.isNumeric("+100".toCharArray()));
        Assert.assertTrue(solution.isNumeric("5e2".toCharArray()));
        Assert.assertTrue(solution.isNumeric("-123".toCharArray()));
        Assert.assertTrue(solution.isNumeric("3.1416".toCharArray()));
        Assert.assertTrue(solution.isNumeric("-1E-16".toCharArray()));
        Assert.assertFalse(solution.isNumeric("12e".toCharArray()));
        Assert.assertFalse(solution.isNumeric("1a3.14".toCharArray()));
        Assert.assertFalse(solution.isNumeric("1.2.3".toCharArray()));
        Assert.assertFalse(solution.isNumeric("+-5".toCharArray()));
        Assert.assertFalse(solution.isNumeric("12e+5.4".toCharArray()));
    }
}
