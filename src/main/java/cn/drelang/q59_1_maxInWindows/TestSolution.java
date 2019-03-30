package cn.drelang.q59_1_maxInWindows;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/30 12:52
 */
public class TestSolution {
    @Test
    public void test() {
        int[] arr = {2, 3, 4, 2, 6, 2, 5, 1};
        int[] expected1 = {4,4,6,6,6,5};

        int[] arr2 = {16,14,12,10,8,6,4};
        int[] expected2 = {16, 14, 12};

        int[] arr3 = {10,14,12,11};
        int[] expected3 = {10, 14, 12, 11};

        Solution solution = new Solution();
        System.out.println(solution.maxInWindows(arr, 3));
        System.out.println(solution.maxInWindows(arr2, 5));
        System.out.println(solution.maxInWindows(arr3, 1));
    }
}
