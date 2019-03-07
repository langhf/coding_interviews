package cn.drelang.q28_symmetricalBinaryTree;

/**
 * 问题：对称的二叉树
 *   请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵
 *   二叉树和它的镜像一样，那么它是对称的。
 *
 * Created by Drelang on 2019/03/07 19:17
 */
class Solution {
    boolean isSymmetrical(TreeNode root) {
        return isSymmetrical(root, root);
    }

    private boolean isSymmetrical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) // 同为 null 则返回 true
            return true;

        if (root1 == null || root2 == null) // 一个为 null，一个不为 null，返回 false
            return false;

        if (root1.val != root2.val)
            return false;

        return isSymmetrical(root1.left, root2.right)
                    && isSymmetrical(root1.right, root2.left);
    }
}