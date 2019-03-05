package cn.drelang.q18_1_deleteNodeInList;

import org.junit.Test;

/**
 * Created by Drelang on 2019/03/05 14:21
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
        solution.deleteNode(head, node3);
        printListValue(head);
        solution.deleteNode(node1, node1);
        printListValue(node1);
    }

    private void printListValue(ListNode head) {
        while(head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }
}
