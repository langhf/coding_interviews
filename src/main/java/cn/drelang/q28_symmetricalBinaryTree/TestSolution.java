package cn.drelang.q28_symmetricalBinaryTree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/07 19:28
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(7);
        root2.left = new TreeNode(7);
        root2.right = new TreeNode(7);
        root2.left.left = new TreeNode(7);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(7);

        Solution solution = new Solution();
        Assert.assertTrue(solution.isSymmetrical(root));
        Assert.assertFalse(solution.isSymmetrical(root2));
        Assert.assertTrue(solution.isSymmetrical(null));
    }
}
