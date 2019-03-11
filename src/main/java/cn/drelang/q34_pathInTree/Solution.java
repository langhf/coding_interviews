package cn.drelang.q34_pathInTree;

import java.util.ArrayList;

/**
 * 题目：二叉树中和为某一值的路径
 *    输入一棵二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所
 * 有路径。从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 *
 * 解法：
 *   用栈保存路径元素，实际写的时候用 List
 *
 * Created by Drelang on 2019/03/10 21:54
 */
class Solution {
    ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        ArrayList<Integer> path = new ArrayList<>();
        int currentSum = 0;
        find(root, target, currentSum, result, path);
        return result;
    }

    private void find(TreeNode root, int target, int currentSum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path) {
        if (root == null)
            return;
        path.add(root.val);
        currentSum += root.val;
        if (currentSum == target && (root.left == null && root.right == null)) {
            result.add(new ArrayList<>(path));
            path.remove(path.size()-1); //返回父节点之前，删除当前节点
            return;
        }
        find(root.left, target, currentSum, result, path);
        find(root.right, target, currentSum, result, path);
        path.remove(path.size()-1); //返回父节点之前，删除当前节点
    }
}
