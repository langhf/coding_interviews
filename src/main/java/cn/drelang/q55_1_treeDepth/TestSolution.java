package cn.drelang.q55_1_treeDepth;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/29 12:59
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        left.right.left = new TreeNode(7);
        right.right = new TreeNode(6);

        Solution solution = new Solution();
        Assert.assertEquals(0, solution.TreeDepth(null));
        Assert.assertEquals(4, solution.TreeDepth(root));
    }
}
