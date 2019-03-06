package cn.drelang.q23_entryNodeInListLoop;

/**
 * 问题:
 *   如果一个链表中包含环，如何找出环的入口节点？
 *
 * 解法：
 *   1. 先判断链表中是否包含闭环，用快慢指针法；
 *   2. 若包含闭环，计算出环的长度，设为 k；
 *   3. 用两个指针，一个指针先走 k 步， 然后两个指针同时走，相遇
 *        的节点就是环的入口节点。
 *
 * Created by Drelang on 2019/03/06 14:51
 */
class Solution {
    ListNode entryNodeInLoop(ListNode pHead) {
        ListNode meetingNode = meetingNode(pHead);
        if (meetingNode == null) return null;
        int loopLength = 1;
        ListNode pNode1 = meetingNode;
        // 计算环的长度
        while (pNode1.next != meetingNode) {
            ++loopLength;
            pNode1 = pNode1.next;
        }

        ListNode first = pHead;
        ListNode second = pHead;
        for(int i=0; i<loopLength; i++) {   // 第一个指针先走环长度的步数
            first = first.next;
        }

        while(first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }

    /**
     * 判断链表是否包含环，若包含环则返回环内的节点，否则返回 null
     */
    private ListNode meetingNode(ListNode pHead) {
        if (pHead == null) return null;
        ListNode slow = pHead;
        if (slow.next == null) return null;
        ListNode fast = slow.next;
        while(fast != null && slow != null) {
            if (fast == slow) return slow;
            slow = slow.next;
            if (fast.next == null) return null;
            fast = fast.next;   // 此时 fast 一定不是 null
            fast = fast.next;   // 此时 fast 可能为null 有可能不为 null
        }
        return null;
    }
}
