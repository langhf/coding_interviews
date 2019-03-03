package cn.drelang.q10_2_jumpFloor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/03 14:46
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.JumpFloor(0));
        Assert.assertEquals(5, solution.JumpFloor(4));
    }
}
