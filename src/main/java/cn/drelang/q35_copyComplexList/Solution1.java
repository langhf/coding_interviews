package cn.drelang.q35_copyComplexList;

import java.util.HashMap;
import java.util.Map;

/**
 * 解法：
 *   用一个 Map 将原节点和复制节点保存起来，在要设置复制节点的
 *   随机节点时，可以从 Map 中查找。
 *  空间复杂度：O(n)
 *  时间复杂度：O(n)
 *
 * Created by Drelang on 2019/03/11 10:50
 */
class Solution1 extends Solution {
    @Override
    RandomListNode clone(RandomListNode phead) {
        if (phead == null) return null;
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode head = phead;
        while (head != null) {  // 1. 复制节点
            RandomListNode node = new RandomListNode(head.label);
            map.put(head, node);
            head = head.next;
        }
        head = phead;
        while (head != null) {  // 2. 设置复制节点的 next 和 random
            map.get(head).next = map.get(head.next);
            map.get(head).random = map.get(head.random);
            head = head.next;
        }
        return map.get(phead);
    }
}
