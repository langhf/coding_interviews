package cn.drelang.q54_kThNode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/29 11:23
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(3);
        left.left = new TreeNode(2);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(7);
        right.left = new TreeNode(6);
        right.right = new TreeNode(8);

        root.left = left;
        root.right = right;

        Solution solution = new Solution();
        Assert.assertNull(solution.KthNode(root, 0));
        Assert.assertEquals(4, solution.KthNode(root, 3).val);
    }
}
