package cn.drelang.q10_4_rectCover;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/03 15:17
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.rectCover(0));
        Assert.assertEquals(1, solution.rectCover(1));
        Assert.assertEquals(2,solution.rectCover(2));
        Assert.assertEquals(13, solution.rectCover(6));
    }
}
