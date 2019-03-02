package cn.drelang.q7_reConstructBinaryTree;

import org.junit.Test;

/**
 * Created by Drelang on 2019/03/02 21:42
 */
public class TestSolution {
    @Test
    public void test() {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println(new Solution().reConstructBinaryTree(pre, in));
    }
}
