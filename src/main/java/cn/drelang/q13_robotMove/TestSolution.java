package cn.drelang.q13_robotMove;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/04 16:02
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.movingCount(0, 2, 3));
        Assert.assertEquals(0, solution.movingCount(18, 0, 5));
        Assert.assertEquals(0, solution.movingCount(18, 5, 0));
        Assert.assertEquals(3, solution.movingCount(2, 1, 3));
    }
}
