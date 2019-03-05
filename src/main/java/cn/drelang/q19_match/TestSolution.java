package cn.drelang.q19_match;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/05 15:05
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        char[] str = {'a', 'a', 'a'};
        char[] pattern = {'a', '.', 'a'};
        char[] pattern1 = {'a', 'b', '*', 'a', 'c', '*', 'a'};
        char[] pattern2 = {'a', 'a', '.', 'a'};
        char[] pattern3 = {'a', 'b', '*', 'a'};

        Assert.assertTrue(solution.isMatch("aaa", "a.a"));
        Assert.assertTrue(solution.isMatch("aaa", "ab*ac*a"));
        Assert.assertFalse(solution.isMatch("aaa", "aa.a"));
        Assert.assertFalse(solution.isMatch("aaa", "ab*a"));
        Assert.assertTrue(solution.isMatch("", ".*"));
    }
}
