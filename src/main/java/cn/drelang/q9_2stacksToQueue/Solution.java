package cn.drelang.q9_2stacksToQueue;

import java.util.Stack;

/**
 * 问题:
 *   用两个栈实现一个队列。并且实现队列的 pop 和 push 函数。
 *
 * 解法:
 *   stack1 用来存储新进来的元素， stack2 用来弹出元素。
 *   当 stack2 不为空时，栈顶元素就是队列的头元素；
 *   当 stack2 为空时，需要将 stack1 中元素倒进 stack2;。
 *
 * Created by Drelang on 2019/03/02 22:04
 */
class Solution {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    void push(int node) {
        stack1.push(node);
    }

    int pop() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {  // 将stack1元素倒入 stack2
                stack2.push(stack1.pop());
            }
        }

        if(stack2.isEmpty()) {
            return 0;
        }

        return stack2.pop();
    }
}
