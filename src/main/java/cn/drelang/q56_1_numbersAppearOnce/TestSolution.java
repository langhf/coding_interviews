package cn.drelang.q56_1_numbersAppearOnce;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/29 15:39
 */
public class TestSolution {
    @Test
    public void test() {
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        int[] array = {2, 4, 3, 6, 3, 2, 5, 5};

        Solution solution = new Solution();
        solution.FindNumsAppearOnce(array, num1, num2);
        Assert.assertEquals(6, num1[0]);
        Assert.assertEquals(4, num2[0]);
    }
}
