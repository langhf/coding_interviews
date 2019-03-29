package cn.drelang.q57_2_continuousSequence;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Drelang on 2019/03/29 21:51
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.FindContinuousSequence(15).toArray()));
    }
}
