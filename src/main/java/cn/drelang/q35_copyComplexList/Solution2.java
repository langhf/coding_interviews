package cn.drelang.q35_copyComplexList;

/**
 * 解法：分步来考虑
 * 1. 将每个节点复制之后连到自身的后面（next）；
 * 2. 因为 N 指向 S， 则N' 指向 N；
 * 3. 总链表中奇数的拆成一个链表，就是原链表；
 *     偶数的拆成一个链表，就是复制后的链表。
 *
 * Created by Drelang on 2019/03/11 11:04
 */
class Solution2 extends Solution {
    @Override
    RandomListNode clone(RandomListNode phead) {
        if (phead == null)
            return null;
        cloneNodes(phead);
        connectSiblingNodes(phead);
        return reconnectNodes(phead);
    }

    // 复制每一个节点
    private void cloneNodes(RandomListNode phead) {
        RandomListNode head = phead;
        while (head != null) {
            RandomListNode nNode = new RandomListNode(head.label);
            nNode.next = head.next;
            head.next = nNode;
            head = nNode.next;
        }
    }

    // 连接随机节点
    private void connectSiblingNodes(RandomListNode pHead) {
        RandomListNode head = pHead;
        while (head != null) {
            RandomListNode cloned = head.next;
            if (head.random != null) {
                cloned.random = head.random.next;   // head.random 的下一个是复制了 head.random 的节点
            }
            head = cloned.next; //跳过自身克隆的节点
        }
    }

    // 拆分总链表
    private RandomListNode reconnectNodes(RandomListNode pHead) {
        RandomListNode head = pHead;
        RandomListNode cloneHead = head.next;   // 建立克隆链表的表头
        RandomListNode cloneNode = cloneHead;
        head.next = cloneNode.next;
        head = head.next;
        while (head != null) {
            cloneNode.next = head.next;
            cloneNode = cloneNode.next;
            head.next = cloneNode.next;
            head = head.next;
        }
        return cloneHead;
    }
}
