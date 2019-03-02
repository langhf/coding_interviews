package cn.drelang.q7_reConstructBinaryTree;

import sun.reflect.generics.tree.Tree;

/**
 * 问题:
 *   输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 *   假设输入的前序遍历和中序遍历的结果都不含重复的数字。例如，
 *   输入前序遍历的序列为 {1, 2, 4, 7, 3, 5, 6, 8} 和中序遍历序列 {4, 7,
 *   2, 1, 5, 3, 8, 6} ，则重建如下所示的二叉树。
 *                                      1
 *                                2          3
 *                           4          5       6
 *                               7            8
 *
 *
 *  解法:
 *    前序遍历的第一个元素就是根节点，根据这个规律可以在中序
 *    遍历中找到根节点，然后中序遍历根节点左边的元素为根节点的
 *    左子树元素，右边的元素为根节点的右子树元素。根据这个规律，
 *    递归直到叶节点。
 *
 * Created by Drelang on 2019/03/02 21:14
 */
class Solution {
    TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return preIn(pre, 0, pre.length-1, in, 0, in.length-1);
    }

    private TreeNode preIn(int[] preOrder, int preStart, int preEnd,
                                                int[] inOrder, int inStart, int inEnd) {
        if(preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);
        for(int i=0; i<inOrder.length; i++) {
            if(inOrder[i] == preOrder[preStart]) {  //找到了中序遍历中的根节点
                // 根节点与中序遍历的第一个元素间隔为 i - inStart
                root.left = preIn(preOrder, preStart+1, preStart+i-inStart, inOrder, inStart, i-1);
                root.right = preIn(preOrder, preStart+i-inStart+1, preEnd, inOrder, i+1, inEnd);
                break;
            }
        }
        return root;
    }
}
