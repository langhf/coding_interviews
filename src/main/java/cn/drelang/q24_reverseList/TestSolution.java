package cn.drelang.q24_reverseList;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/06 19:16
 */
public class TestSolution {
    @Test
    public void test() {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        Solution solution = new Solution();
        head = solution.ReverseList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        Assert.assertNull(solution.ReverseList(null));
    }
}
