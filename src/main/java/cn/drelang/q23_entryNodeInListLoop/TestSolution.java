package cn.drelang.q23_entryNodeInListLoop;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/06 15:14
 */
public class TestSolution {
    @Test
    public void test() {
        ListNode pHead = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        pHead.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node1;

        Solution solution = new Solution();
        Assert.assertNull(solution.entryNodeInLoop(null));
        Assert.assertEquals(1, solution.entryNodeInLoop(pHead).val);
        Assert.assertEquals(3, solution.entryNodeInLoop(node3).val);
    }
}
