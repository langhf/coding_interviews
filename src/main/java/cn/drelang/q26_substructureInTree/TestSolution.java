package cn.drelang.q26_substructureInTree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/07 13:22
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(8);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(9);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(4);
        root1.left.right.left = new TreeNode(7);

        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(2);

        Solution solution = new Solution();
        Assert.assertTrue(solution.hasSubTree(root1, root2));
        Assert.assertFalse(solution.hasSubTree(root1, null));
    }
}
