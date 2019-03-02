package cn.drelang.q5_replaceSpace;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/02 16:10
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        StringBuffer s1 = new StringBuffer("We are happy");
        StringBuffer s2 = new StringBuffer("   ");
        StringBuffer s3 = null;

        Assert.assertEquals("We%20are%20happy", solution.replaceSpace(s1));
        Assert.assertEquals("%20%20%20", solution.replaceSpace(s2));
        Assert.assertNull(solution.replaceSpace(s3));
    }
}
