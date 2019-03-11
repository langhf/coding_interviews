package cn.drelang.q34_pathInTree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Drelang on 2019/03/11 08:59
 */
public class TestSolution  {
    @Test
    public void test() {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        node1.left = new TreeNode(4);
        node1.right = new TreeNode(7);
        root.right = new TreeNode(12);
        root.left = node1;

        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> result = solution.FindPath(root, 22);
        System.out.println(result);
        System.out.println(solution.FindPath(null, 22));
    }
}
