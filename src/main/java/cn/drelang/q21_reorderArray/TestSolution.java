package cn.drelang.q21_reorderArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Drelang on 2019/03/06 09:35
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums1 = null;
        int[] nums2 = {};
        int[] nums3 = {5, 4, 3, 2, 1};
        int[] nums4 = {1};
        solution.reOrderArray(nums);
        solution.reOrderArray(nums1);
        solution.reOrderArray(nums2);
        solution.reOrderArray(nums3);
        solution.reOrderArray(nums4);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
    }
}
