package cn.drelang.q30_minInStack;

import java.util.Stack;

/**
 * 问题：包含 min 函数的栈
 *   定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的
 *   min 函数。在该栈中，调用 min, push 以及 pop 时间复杂度都是 O(1)。
 *
 * 解法：
 *   使用一个栈和一个辅助栈。
 *   当 push 一个元素时，
 *          若辅助栈栈顶元素大于新元素，则新元素进入辅助栈；
 *          若辅助栈栈顶元素不大于新元素，则复制辅助栈栈顶元素进辅助栈；
 *          由此，辅助栈栈顶保持了最小元素。
 *   当 pop 一个元素时，辅助栈也 pop 元素，由此保证辅助栈的最小值一定在主栈内！
 *
 * Created by Drelang on 2019/03/07 20:46
 */
class Solution {
    private Stack<Integer> assistStack = new Stack<>();
    private Stack<Integer> stack = new Stack<>();
    void push(int node) {
        stack.push(node);

        if (assistStack.isEmpty()) {    // 辅助栈为空
            assistStack.push(node);
            return;
        }

        if (assistStack.peek() > node) { // 辅助栈不为空而且栈顶元素大于新元素
            assistStack.push(node);
            return;
        }
        assistStack.push(assistStack.peek());   // 否则，复制辅助栈栈顶元素进栈
    }

    void pop() {
        if (!stack.isEmpty())
            stack.pop();

        if (!assistStack.isEmpty())
            assistStack.pop();
    }

    int top() {
        if (!stack.isEmpty())
            return stack.peek();
        return 0;
    }

    int min() {
        if (!assistStack.isEmpty())
            return assistStack.peek();
        return 0;
    }
}
