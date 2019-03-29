package cn.drelang.q55_2_balanceBinaryTree;

/**
 * 问题：平衡二叉树
 *      输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 *      如果某二叉树中任意节点的左、右子树的深度相差不超过1，那么
 *      它就是一棵平衡二叉树。
 *
 * 解法：
 *      用后序遍历的方法，可以避免循环搜索。
 *
 * Created by Drelang on 2019/03/29 14:20
 */
class Solution {
    boolean IsBalanced_Solution(TreeNode root) {
        return isBalanced(root) != -1;
    }

    private int isBalanced(TreeNode root) {
        if (root == null)
            return 0;

        int nLeft = isBalanced(root.left);
        if (nLeft == -1)    // 左子树不为平衡树
            return -1;

        int nRight = isBalanced(root.right);
        if (nRight == -1)   // 右子树不为平衡树
            return -1;

        if (Math.abs(nLeft-nRight) <= 1)
            return Math.max(nLeft, nRight) + 1;
        else
            return -1;

    }
}
