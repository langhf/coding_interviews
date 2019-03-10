package cn.drelang.q33_sequenceOfBST;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/10 15:07
 */
public class TestSolution {
    @Test
    public void test() {
        int[] sequence1 = {5, 7, 6, 9, 11, 10, 8};
        int[] sequence2 = {7, 4, 6, 5};
        Solution solution = new Solution();
        Assert.assertTrue(solution.VerifySquenceOfBST(sequence1));
        Assert.assertFalse(solution.VerifySquenceOfBST(sequence2));
    }
}
