package cn.drelang.q6_printListFromTailToHead;

import org.junit.Test;

/**
 * Created by Drelang on 2019/03/02 18:37
 */
public class TestSolution {
    @Test
    public void test() {
        Solution solution1 = new Solution1();
        testCase(solution1);

        Solution solution2 = new Solution2();
        testCase(solution2);
    }

    private void testCase(Solution solution) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = null;

        System.out.println(solution.printListFromTailToHead(l1));
        System.out.println(solution.printListFromTailToHead(l2));
    }
}
