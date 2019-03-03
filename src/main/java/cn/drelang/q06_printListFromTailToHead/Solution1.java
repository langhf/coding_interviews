package cn.drelang.q06_printListFromTailToHead;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 用栈来实现
 *
 * Created by Drelang on 2019/03/02 18:38
 */
class Solution1 extends Solution {
    @Override
    ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode dummyHead = listNode;
        while(dummyHead != null) {
            stack.add(dummyHead.val);
            dummyHead = dummyHead.next;
        }

        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
