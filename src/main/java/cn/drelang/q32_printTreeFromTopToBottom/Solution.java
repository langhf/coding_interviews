package cn.drelang.q32_printTreeFromTopToBottom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 问题：不分行从上往下打印二叉树
 *   从上往下打印出二叉树的每个结点，同一层的结点按照从左到右的顺序打印。
 *
 *解法：
 *   从根节点开始，将根节点的左右子节点放入队列，然后将队列头元素的
 *   左右节点加入队列后，头元素再出列。依次类推，直到子节点为 null。
 *
 * Created by Drelang on 2019/03/09 20:14
 */
class Solution {

    ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        result.add(root.val);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.left != null) {
                queue.offer(root.left);
                result.add(root.left.val);
            }
            if (root.right != null) {
                queue.offer(root.right);
                result.add(root.right.val);
            }
        }
        return result;
    }
}
