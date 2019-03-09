package cn.drelang.q31_stackPushPopOrder;

import java.util.Stack;

/**
 * 题目：栈的压入、弹出序列
 *   输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二
 *   个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 *   例如序列1、2、3、4、5是某栈的压栈序列，序列4、5、3、2、1
 *   是该压栈序列对应的一个弹出序列，但4、3、5、1、2就不可能是
 *   该压栈序列的弹出序列。
 *
 * 解法：
 *   根据弹出序列来压入。
 *   如进栈序列为 1, 2, 3, 4, 5，出栈序列为 4, 5, 3, 2, 1
 *   出4的时候，先看栈顶是否是 4 若不是则从进栈序列压入元素，
 *   直到碰到 4 为止。依次判断出栈序列的其他元素，若入站序列遍历玩
 *   完且在栈内找不到元素，则说明这不是一对压入、弹出序列。
 *
 * Created by Drelang on 2019/03/08 17:20
 */
class Solution {
    private Stack<Integer> stack = new Stack<>();
    private int pushIndex;
    boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null) return false;
        int m = pushA.length;
        int n = popA.length;
        if (m != n) return false;
        pushIndex = 0;
        int i=0;
        while (i<n){
            if (!isInStack(pushA, popA[i++]))
                break;
        }

        return stack.isEmpty() && i == n;
    }

    // 判断出栈元素是否在栈内
    private boolean isInStack(int[] pushA,  int num) {
        if (!stack.isEmpty() && stack.peek() == num) {  // 栈不空且栈顶元素是目标元素
            stack.pop();
            return true;
        }
        else {  // 栈空或目标元素不为要查找的元素
            while (pushIndex < pushA.length) {
                if (pushA[pushIndex] != num) {
                    stack.push(pushA[pushIndex++]);
                }
                else {
                    pushIndex++;
                    return true;
                }
            }
        }
        return false;
    }
}
