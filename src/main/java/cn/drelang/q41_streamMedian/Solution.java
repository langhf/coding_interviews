package cn.drelang.q41_streamMedian;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 问题：数据流中的中位数
 *   如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么
 *   中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 *   那么中位数就是所有数值排序之后中间两个数的平均值。
 *
 * 解法：
 *   对半分，左边保持最大堆，右边保持最小堆。
 *   若两边数量一样，则最小堆（右边）新加入一个元素。具体操作是，新元素先
 *   加入最大堆（左边），然后将最大堆的元素移到最小堆中。
 *   若两边数量差一，则最大堆（左边）新加入一个元素。具体操作是，新元素先
 *   加入最小堆（右边），然后将最小堆的元素移到最大堆中。
 *
 * Created by Drelang on 2019/03/13 14:53
 */
class Solution {
    private int count;
    private PriorityQueue<Integer> minHeap  = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    void Insert(Integer num) {
        if (count % 2 == 0) {   // 最小堆加入一个元素
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        else {  // 最大堆加入一个元素
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        count++;
    }

    Double GetMedian() {
        if (count % 2 == 0 ) {
            return (double) (minHeap.peek() + maxHeap.peek())/2;
        }
        else {
            return (double)minHeap.peek();
        }
    }
}
