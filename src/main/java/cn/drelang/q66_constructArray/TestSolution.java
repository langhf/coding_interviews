package cn.drelang.q66_constructArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Drelang on 2019/03/31 11:21
 */
public class TestSolution {
    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4, 5};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.multiply(arr)));
    }
}
