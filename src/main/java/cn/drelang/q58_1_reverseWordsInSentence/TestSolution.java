package cn.drelang.q58_1_reverseWordsInSentence;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/30 10:14
 */
public class TestSolution {
    @Test
    public void test() {
        String str = "I am a student.";
        String str1 = " I am a student.";
        String str2 = "I am a student. ";

        Solution solution = new Solution();
        Assert.assertEquals("student. a am I", solution.ReverseSentence(str));
        Assert.assertEquals("student. a am I", solution.ReverseSentence(str1));
        Assert.assertEquals(" student. a am I", solution.ReverseSentence(str2));
    }
}
