package cn.drelang.q55_1_treeDepth;

/**
 * 问题：二叉树的深度
 *      输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依
 *      次经过的节点形成树的一条路径，最长路径的长度为树的深度。
 *
 * 解法：
 *      根节点的深度为左子树或右子树深度加1. 因此可以递归来求树的深度。
 *
 * Created by Drelang on 2019/03/29 12:54
 */
class Solution {
    int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;

        int nLeft = TreeDepth(root.left);
        int nRight = TreeDepth(root.right);
        return (nLeft>nRight) ? nLeft+1 : nRight+1;
    }
}
