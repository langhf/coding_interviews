package cn.drelang.q24_reverseList;

/**
 * 问题:
 *   定义一个函数，输入一个链表的头节点，反转该链表并输出反转
 *   后链表的头节点。
 *
 * 解法：
 * 用三个指针，分别指向当前节点，当前节点的前一个节点，以及
 * 当前节点后面的节点
 *
 * 1. 将 pre 设为 null，将头结点赋给 current，将 current.next 赋给 reservedHead.
 *      若current 不为 null，则将 current.next 设为 pre, pre 设为 current,
 *          current 设为 reservedHead , reservedHead 设为 reservedHead.next
 *
 * Created by Drelang on 2019/03/06 18:53
 */
class Solution {
    ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;   // 保留下一个节点，防止丢失
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;     // 返回 pre，因为 pre 能够达到最后一个不为 null 的节点， 而 head 变成了 null
    }
}
