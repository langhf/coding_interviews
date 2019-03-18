package cn.drelang.q46_translateNumbersToStrings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/18 15:21
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.getTranslationCount(-11));
        Assert.assertEquals(5, solution.getTranslationCount(12258));
        Assert.assertEquals(1, solution.getTranslationCount(53541));
    }
}
