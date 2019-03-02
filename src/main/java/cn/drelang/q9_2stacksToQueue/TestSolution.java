package cn.drelang.q9_2stacksToQueue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/02 22:12
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        solution.push(3);
        Assert.assertEquals(1, solution.pop());
        Assert.assertEquals(2, solution.pop());
    }
}
