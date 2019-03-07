package cn.drelang.q26_substructureInTree;

/**
 * 问题：
 *   输入两棵二叉树 A 和 B，判断 B 是不是 A 的子结构。
 *
 * 用递归的方法。
 *   1. 判断 A 中是否存在节点的值与 B 的根节点值相同
 *   2. 若 A 中存在 B 的根节点值，则继续判断 A 是否有与 B 相同的子结构
 *
 * Created by Drelang on 2019/03/07 13:09
 */
class Solution {
    boolean hasSubTree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val)
                result = doesTree1HasTree2(root1, root2);
            if (!result)
                result = hasSubTree(root1.left, root2);
            if (!result)
                result = hasSubTree(root1.right, root2);
        }
        return result;
    }

    boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val == root2.val) {
            return doesTree1HasTree2(root1.left, root2.left) && doesTree1HasTree2(root1.right, root2.right);
        }
        return false;
    }
}
