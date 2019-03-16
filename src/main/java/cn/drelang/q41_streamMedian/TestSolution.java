package cn.drelang.q41_streamMedian;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/16 11:15
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        solution.Insert(1);
        solution.Insert(3);
        solution.Insert(5);
        solution.Insert(7);
        solution.Insert(9);
        Assert.assertEquals(5.0, solution.GetMedian(), 0.1);
        solution.Insert((11));
        Assert.assertEquals(6.0, solution.GetMedian(), 0.1);
    }
}
