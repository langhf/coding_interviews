package cn.drelang.q52_firstCommonNodesInLists;

/**
 * 问题：两个链表的第一个公共结点
 *   输入两个链表，找出它们的第一个公共结点。
 *
 * 解法：
 *  两个有相同节点的链表之间，一定呈 Y 字型。
 *  可以让长的链表先走多出的长度的步数，然后两个链表再一起走。
 *
 * Created by Drelang on 2019/03/22 09:55
 */
class Solution {
    ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)
            return null;

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int m=0, n=0;
        while (p1 != null) {
            ++m;
            p1 = p1.next;
        }
        while (p2 != null) {
            ++n;
            p2 = p2.next;
        }

        p1 = pHead1;
        p2 = pHead2;
        if (m > n) {
            for (int i=0; i<(m-n); i++) {
                p1 = p1.next;
            }
        }
        else {
            for (int i=0; i<(n-m); i++) {
                p2 = p2.next;
            }
        }

        while (p1 != null && p2 != null) {
            if (p1.val == p2.val)
                break;
            else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return p1;
    }
}
