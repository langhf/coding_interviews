package cn.drelang.q22_KthNodeFromEnd;

/**
 * 问题:
 *   输入一个链表，输出该链表中倒数第k个结点。
 *
 * Created by Drelang on 2019/03/06 10:31
 */
class Solution {
    ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 1) return null;
        ListNode pAhead = head;
        ListNode pBehind = head;
        for(int i=0; i<k-1; i++) {  // 让第一个指针先走 k-1 步
            if (pAhead.next == null)
                return null;
            else
                pAhead = pAhead.next;
        }

        while(pAhead.next != null) {
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }

        return pBehind;
    }
}
