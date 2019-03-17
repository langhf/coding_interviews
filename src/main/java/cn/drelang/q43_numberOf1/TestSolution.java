package cn.drelang.q43_numberOf1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/17 15:31
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.NumberOf1Between1AndN_Solution(12));
    }
}
