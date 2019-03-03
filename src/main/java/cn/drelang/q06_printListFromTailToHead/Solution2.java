package cn.drelang.q06_printListFromTailToHead;

import java.util.ArrayList;

/**
 * 基于递归，到达链表尾的时候反向打印
 *
 * Created by Drelang on 2019/03/02 18:44
 */
class Solution2 extends Solution {
    private ArrayList<Integer> result = new ArrayList<>();

    @Override
    ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        recurse(listNode);
        return result;
    }

    private void recurse(ListNode listNode) {
        if(listNode != null) {
            if(listNode.next != null) {    // 递归终止的条件
                recurse(listNode.next);
            }
            result.add(listNode.val);
        }
    }
}
