package cn.drelang.q35_copyComplexList;

import org.junit.Test;

/**
 * Created by Drelang on 2019/03/11 10:57
 */
public class TestSolution {
    @Test
    public void test() {
        testCase(new Solution1());
        testCase(new Solution2());
    }

    private void testCase(Solution solution) {
        RandomListNode head = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        head.random = node3;
        node2.random = node5;
        node4.random = node2;
        RandomListNode result = solution.clone(head);
    }
}
