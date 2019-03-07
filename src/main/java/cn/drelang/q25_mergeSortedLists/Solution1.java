package cn.drelang.q25_mergeSortedLists;

/**
 * 递归法
 *
 * Created by Drelang on 2019/03/06 19:37
 */
class Solution1 extends Solution {
    @Override
    ListNode merge(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null)
            return pHead2;
        if (pHead2 == null)
            return pHead1;

        ListNode pMergedHead = null;
        if (pHead1.val < pHead2.val) {
            pMergedHead = pHead1;
            pMergedHead.next = merge(pHead1.next, pHead2);
        }
        else {
            pMergedHead = pHead2;
            pMergedHead.next = merge(pHead1, pHead2.next);
        }
        return pMergedHead;
    }
}
