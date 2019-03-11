package cn.drelang.q36_convertBinarySearchTree;

/**
 * 问题：二叉搜索树与双向链表
 *   输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求
 * 不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 * Created by Drelang on 2019/03/11 19:54
 */
class Solution {
    private TreeNode pLastNodeInList = null;

    TreeNode Convert(TreeNode pRootOfTree) {
        convertNode(pRootOfTree);
        TreeNode pHeadOfList = pLastNodeInList;
        while (pHeadOfList != null && pHeadOfList.left != null) {
            pHeadOfList = pHeadOfList.left;
        }
        return pHeadOfList;
    }

    private void convertNode(TreeNode pNode) {
        if (pNode == null)
            return;

        if (pNode.left != null) {
            convertNode(pNode.left);
        }
        pNode.left = pLastNodeInList;

        if (pLastNodeInList != null) {
            pLastNodeInList.right = pNode;
        }
        pLastNodeInList = pNode;

        if (pNode.right != null) {
            convertNode(pNode.right);
        }
    }
}
