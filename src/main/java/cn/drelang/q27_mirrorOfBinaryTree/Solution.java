package cn.drelang.q27_mirrorOfBinaryTree;

/**
 * 问题：
 *   请完成一个函数，输入一棵二叉树，该函数输出它的镜像。
 *
 * Created by Drelang on 2019/03/07 19:08
 */
class Solution {
    void mirror(TreeNode root) {
        if (root == null)
            return ;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
