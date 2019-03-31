package cn.drelang.q68_commonPathInTree;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/31 16:20
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root = new TreeNode(11);
        TreeNode left = new TreeNode(12);
        TreeNode right = new TreeNode(13);
        left.left = new TreeNode(14);
        left.right = new TreeNode(15);
        right.left = new TreeNode(16);
        right.right = new TreeNode(17);

        root.left = left;
        root.right = right;

        Solution solution = new Solution();
        Assert.assertEquals(12, solution.getLastCommonPath(root, left.left, left.right).val);
        Assert.assertEquals(11, solution.getLastCommonPath(root, left, left.left).val);
        Assert.assertEquals(13, solution.getLastCommonPath(root, right.left, right.right).val);
    }
}
