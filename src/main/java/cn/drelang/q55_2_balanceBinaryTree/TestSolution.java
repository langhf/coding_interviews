package cn.drelang.q55_2_balanceBinaryTree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/29 14:31
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root1 = new TreeNode(3);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(7);
        root1.left = left;
        root1.right = right;
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);

        Solution solution = new Solution();
        Assert.assertTrue(solution.IsBalanced_Solution(null));
        Assert.assertTrue(solution.IsBalanced_Solution(root1));
        Assert.assertFalse(solution.IsBalanced_Solution(root2));

    }
}
