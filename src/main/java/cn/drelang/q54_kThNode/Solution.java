package cn.drelang.q54_kThNode;

/**
 * 题目：二叉搜索树的第 k 个节点
 *      给定一棵二叉搜索树，请找出其中的第 k 大的节点。
 *
 * Created by Drelang on 2019/03/29 11:07
 */
class Solution {
    private int index;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k <=0)
            return null;
        index = 0;
        return core(pRoot, k);
    }

    private TreeNode core(TreeNode root, int k) {
        if (root != null) {
            TreeNode node = core(root.left, k);
            if (node != null)   // 在左子树内找到目标节点
                return node;

            index++;
            if (index == k)
                return root;

            TreeNode node1 = core(root.right, k);
            if (node1 != null)  // 在右子树内找到目标节点
                return node1;
        }
        return null;
    }
}
