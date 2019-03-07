package cn.drelang.q25_mergeSortedLists;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/06 19:40
 */
public class TestSolution {
    @Test
    public void test() {
        testCase(new Solution1());
        testCase(new Solution2());
    }

    private void testCase(Solution solution) {
        ListNode pHead = new ListNode(7);
        ListNode node1 = new ListNode(8);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(10);
        pHead.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode phead2 = new ListNode(5);
        ListNode node4  = new ListNode(6);
        ListNode node5 = new ListNode(7);
        phead2.next = node4;
        node4.next = node5;

        ListNode head = solution.merge(pHead, phead2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        Assert.assertNull(solution.merge(null, null));
    }
}
