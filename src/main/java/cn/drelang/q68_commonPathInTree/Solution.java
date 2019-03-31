package cn.drelang.q68_commonPathInTree;

import java.util.ArrayList;

/**
 * 问题：树中两个结点的最低公共祖先
 *      输入两个树结点，求它们的最低公共祖先
 *
 * 解法：
 *      保存从根节点到两个节点的路径，即链表，然后将问题转化为求
 *      两个链表的最后公共节点
 *
 * Created by Drelang on 2019/03/31 15:24
 */
class Solution {
    TreeNode getLastCommonPath(TreeNode root, TreeNode p1, TreeNode p2) {
        if (root == null)
            return null;

        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();
        getPath(root, p1, path1);
        getPath(root, p2, path2);
        return getLastCommonNode(path1, path2);

    }

    private boolean getPath(TreeNode root, TreeNode target, ArrayList<TreeNode> path) {
        if (root == null)
            return false;

        if (root.val == target.val)
            return true;

        path.add(root);
        boolean found;
        found = getPath(root.left, target, path) || getPath(root.right, target, path);
        if (!found)
            path.remove(path.size()-1); //该路径不包含目标元素，因此路径最后的一个元素
        return found;
    }

    private TreeNode getLastCommonNode(ArrayList<TreeNode> path1, ArrayList<TreeNode> path2) {
        TreeNode result = new TreeNode(-1);
        for (int i=0; i<path1.size() && i<path2.size(); i++) {
            if (path1.get(i).val == path2.get(i).val)
                result = path1.get(i);
        }
        return result;
    }

}
