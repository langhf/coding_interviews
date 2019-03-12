package cn.drelang.q37_serializeBinaryTrees;

import org.junit.Test;

/**
 * Created by Drelang on 2019/03/12 10:32
 */
public class TestSolution {
    @Test
    public void test() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        node1.left = new TreeNode(4);
        TreeNode node2 = new TreeNode(3);
        node2.left = new TreeNode(5);
        node2.right = new TreeNode(6);
        root.left = node1;
        root.right = node2;
        Solution solution = new Solution();
       String result = solution.Serialize(root);
       TreeNode re = solution.Deserialize(result);
       System.out.println(re);
    }
}
