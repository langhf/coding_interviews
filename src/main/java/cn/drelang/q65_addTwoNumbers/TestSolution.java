package cn.drelang.q65_addTwoNumbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/30 20:35
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(8, solution.Add(3, 5));
        Assert.assertEquals(-10, solution.Add(-1, -9));
        Assert.assertEquals(100, solution.Add(34, 66));
    }
}
