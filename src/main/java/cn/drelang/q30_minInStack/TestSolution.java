package cn.drelang.q30_minInStack;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/07 20:58
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        solution.push(3);
        solution.push(4);
        solution.push(2);
        solution.push(1);
        Assert.assertEquals(1, solution.min());
        solution.pop();
        Assert.assertEquals(2, solution.min());
        solution.pop();
        Assert.assertEquals(3, solution.min());
        solution.push(0);
        Assert.assertEquals(0, solution.min());
    }
}
