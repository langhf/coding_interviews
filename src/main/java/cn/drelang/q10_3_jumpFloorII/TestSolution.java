package cn.drelang.q10_3_jumpFloorII;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/03 14:56
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.JumpFloorII(1));
        Assert.assertEquals(2, solution.JumpFloorII(2));
        Assert.assertEquals(4, solution.JumpFloorII(3));
        Assert.assertEquals(1024, solution.JumpFloorII(11));
    }
}
