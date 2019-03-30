package cn.drelang.q58_2_leftRotateString;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/30 10:46
 */
public class TestSolution {
    @Test
    public void test() {
        String str = "abcdefg";
        Solution solution = new Solution();
        Assert.assertEquals("cdefgab", solution.LeftRotateString(str, 2));
    }
}
