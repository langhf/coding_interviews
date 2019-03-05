package cn.drelang.q18_1_deleteNodeInList;

/**
 * 问题:
 *   在 O(1) 时间内删除链表节点。
 *   给定单向链表的头指针和一个节点指针，定义一个函数在 O(1) 时间内删除该节点。
 *
 * 解法:
 *   对于非链表尾的节点，可以用要删除的下一个节点覆盖要删除的节点的方法；
 *   对于链表尾的节点，只能遍历到尾部前一个节点来删除尾部节点。
 *   总的时间复杂度为 [ (n-1) * O(1) + O(n) ] / n .
 *
 * Created by Drelang on 2019/03/05 14:04
 */

class Solution {
    void deleteNode(ListNode pHead, ListNode toBeDeleted) {
        if (pHead == null || toBeDeleted == null) return;
        if (toBeDeleted.next == null) {     // 若 toBeDeleted 为链表尾
            ListNode dummyHead = pHead;
            // 只有一个节点的情况
            if(dummyHead.val == toBeDeleted.val) {
                dummyHead = null;
                return;
            }
            // 不止一个节点
            while( dummyHead.next != null) {
                if(dummyHead.next.val == toBeDeleted.val) {
                    dummyHead.next = null;
                    return;
                }
                dummyHead = dummyHead.next;
            }
        }
        else {  // toBeDeleted 不为链表尾
            toBeDeleted.val = toBeDeleted.next.val;
            toBeDeleted.next = toBeDeleted.next.next;
        }
    }
}
