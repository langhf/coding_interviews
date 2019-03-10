package cn.drelang.q32_2_printTreesInLines;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 问题：分行从上到下打印二叉树
 *   从上到下按层打印二叉树，同一层的结点按从左到右的顺序打印，
 *   每一层打印到一行。
 *
 * 解法：
 *   广度优先。用两个变量，一个变量表示在当前层中还没有打印的节点数，
 *   另一个变量表示下一层节点的数目。
 *
 * Created by Drelang on 2019/03/10 10:35
 */
class Solution {
    void printTreesInLines(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int toBePrint = 1;
        int nextLevel = 0;
        while (!queue.isEmpty()) {
            root = queue.poll();
            toBePrint--;
            System.out.print(root.val + " ");

            if (root.left != null) {
                queue.offer(root.left);
                nextLevel++;
            }
            if (root.right != null) {
                queue.offer(root.right);
                nextLevel++;
            }

            if (toBePrint == 0) {
                System.out.println();
                toBePrint = nextLevel;
                nextLevel = 0;
            }
        }

    }
}
