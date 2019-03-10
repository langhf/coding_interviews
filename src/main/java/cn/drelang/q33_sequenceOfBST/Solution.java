package cn.drelang.q33_sequenceOfBST;

/**
 * 题目：二叉搜索树的后序遍历序列
 *   输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 *  如果是则返回true，否则返回false。假设输入的数组的任意两个数字都互不相同。
 *
 * 解法：
 *   找后序遍历的特点。
 *
 * Created by Drelang on 2019/03/10 14:54
 */
class Solution {
    boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length < 1)
            return false;
        return verify(sequence, 0, sequence.length-1);
    }

    private boolean verify(int[] sequence, int start, int end) {
        if (sequence == null) return false;
        int i=start;
        while (i<end) {
            if (sequence[i] > sequence[end])
                break;
            i++;
        }
        int j=i;
        while (j<end) {
            if (sequence[j] < sequence[end])
                return false;
            j++;
        }

        boolean left = true;
        if (i>start) {  // 判断左子树
            left = verify(sequence, start, i-1);
        }

        boolean right = true;
        if (j<end) {   // 判断右子树
            right = verify(sequence, i, end-1);
        }

        return left && right;
    }
}
