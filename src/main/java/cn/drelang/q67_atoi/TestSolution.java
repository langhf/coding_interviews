package cn.drelang.q67_atoi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/31 13:01
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(11, solution.StrToInt("11"));
        Assert.assertEquals(11, solution.StrToInt("+11"));
        Assert.assertEquals(-11, solution.StrToInt("-11"));
        Assert.assertEquals(0, solution.StrToInt("0"));
        Assert.assertEquals(2147483647, solution.StrToInt("+2147483647"));
        Assert.assertEquals(0, solution.StrToInt("2147483648"));
        Assert.assertEquals(-2147483648, solution.StrToInt("-2147483648"));
        Assert.assertEquals(0, solution.StrToInt("-2147483649"));
    }
}
