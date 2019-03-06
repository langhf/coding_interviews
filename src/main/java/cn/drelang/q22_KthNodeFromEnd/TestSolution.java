package cn.drelang.q22_KthNodeFromEnd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/06 10:43
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Assert.assertEquals(4, solution.FindKthToTail(head, 1).val);
        Assert.assertNull(solution.FindKthToTail(null, 1));
        Assert.assertNull(solution.FindKthToTail(head, 5));
    }
}
