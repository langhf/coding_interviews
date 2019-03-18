package cn.drelang.q45_sortArrayForMinNumber;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/18 11:26
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[] arr = {3, 32, 321};
        Assert.assertEquals("321323", solution.PrintMinNumber(arr));
    }
}
