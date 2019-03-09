package cn.drelang.q32_printTreeFromTopToBottom;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Drelang on 2019/03/09 20:55
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(6);
        node1.left = new TreeNode(5);
        node1.right = new TreeNode(7);
        TreeNode node2 = new TreeNode(10);
        node2.left = new TreeNode(9);
        node2.right = new TreeNode(11);
        root.left = node1;
        root.right = node2;

        int[] testResult = {8, 6, 10, 5, 7, 9, 11};

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.PrintFromTopToBottom(root);
        Assert.assertNull(solution.PrintFromTopToBottom(null));
    }
}
