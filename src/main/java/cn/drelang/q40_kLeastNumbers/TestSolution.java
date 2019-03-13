package cn.drelang.q40_kLeastNumbers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Drelang on 2019/03/13 10:40
 */
public class TestSolution {
    @Test
    public void test() {
        test(new Solution1());
        test(new Solution2());
    }
    public void test(Solution solution) {
        int[] arr1 = {4,5,1,6,2,7,3,8};
        System.out.println(solution.GetLeastNumbers_Solution(arr1, 4));
    }
}
