package cn.drelang.q25_mergeSortedLists;

/**
 * 用一个虚假的链表头
 *
 * Created by Drelang on 2019/03/06 19:48
 */
class Solution2 extends Solution {
    @Override
    ListNode merge(ListNode pHead1, ListNode pHead2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (pHead1 != null || pHead2 != null) {
            if (pHead1 == null) {
                current.next = pHead2;
                break;
            }
            if (pHead2 == null) {
                current.next = pHead1;
                break;
            }

            if (pHead1.val < pHead2.val) {
                current.next = pHead1;
                pHead1 = pHead1.next;
            }
            else {
                current.next = pHead2;
                pHead2 = pHead2.next;
            }
            current = current.next;
        }
        return dummyHead.next;
    }
}
