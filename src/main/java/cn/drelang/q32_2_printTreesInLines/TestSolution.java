package cn.drelang.q32_2_printTreesInLines;

import org.junit.Test;

/**
 * Created by Drelang on 2019/03/10 10:42
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root = new TreeNode(8);
        TreeNode node1 = new TreeNode(6);
        node1.left = new TreeNode(7);
        node1.right = new TreeNode(5);
        TreeNode node2 = new TreeNode(11);
        node2.left = new TreeNode(12);
        node2.right = new TreeNode(13);
        root.left = node1;
        root.right = node2;
        new Solution().printTreesInLines(root);
    }
}
