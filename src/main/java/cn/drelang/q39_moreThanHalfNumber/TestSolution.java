package cn.drelang.q39_moreThanHalfNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/12 21:30
 */
public class TestSolution {
    @Test
    public void test() {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int[] array2 = {};

        Solution solution = new Solution();
        Assert.assertEquals(2, solution.MoreThanHalfNum_Solution(array));
        Assert.assertEquals(0, solution.MoreThanHalfNum_Solution(null));
        Assert.assertEquals(0, solution.MoreThanHalfNum_Solution(array2));
    }
}
