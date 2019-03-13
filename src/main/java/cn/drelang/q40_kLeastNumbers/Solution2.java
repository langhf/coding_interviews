package cn.drelang.q40_kLeastNumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 解法：
 *   用最大堆保存这 k 个数.
 *   将数组中前 k 个数放入最大堆，对于数组中之后的数字，若数字
 *   大于堆顶数字，则跳过；若数字小于堆顶数字，则用该数字替换
 *   堆顶数字。
 *
 * Created by Drelang on 2019/03/13 11:02
 */
class Solution2 extends Solution {
    ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null ||  k>input.length || k<=0)
            return list;

        PriorityQueue<Integer> maxHeap  = new PriorityQueue<>(input.length, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);    // 大的排在队列前面
            }
        });

        for (int ele : input) {
            if (maxHeap.size() != k) {
                maxHeap.offer(ele);
            }
            else {
                if (maxHeap.peek() > ele) {
                    maxHeap.poll();
                    maxHeap.offer(ele);
                }
            }
        }

        list.addAll(maxHeap);
        return list;
    }
}
