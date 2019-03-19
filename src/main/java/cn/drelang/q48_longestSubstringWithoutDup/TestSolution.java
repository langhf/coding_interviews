package cn.drelang.q48_longestSubstringWithoutDup;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/19 11:06
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.longestSubstringWithoutDup(""));
        Assert.assertEquals(0, solution.longestSubstringWithoutDup(null));
        Assert.assertEquals(4, solution.longestSubstringWithoutDup("arabcacfr"));
    }
}
