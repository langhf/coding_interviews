package cn.drelang.q50_1_firstNotRepeatingChar;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/19 15:49
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(-1, solution.FirstNotRepeatingChar(""));
        Assert.assertEquals(-1, solution.FirstNotRepeatingChar(null));
        Assert.assertEquals(1, solution.FirstNotRepeatingChar("abaccdeff"));
        Assert.assertEquals(5, solution.FirstNotRepeatingChar("googgle"));
    }
}
