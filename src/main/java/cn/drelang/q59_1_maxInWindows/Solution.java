package cn.drelang.q59_1_maxInWindows;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 问题：滑动窗口的最大值
 *      给定一个数组和滑动窗口的大小，请找出所有滑动窗口里的最大值。
 *      例如，如果输入数组 {2,3,4,2,6,2,5,1} 及滑动窗口的大小 3 ，那么
 *      一共存在 6 个滑动窗口，它们的最大值分别为 {4, 4, 6, 6, 6, 5} 。
 *
 * 解法：
 *      用双端队列，队列的第一个位置保存当前窗口最大值，当窗口滑动一次：
 *      1. 判断当前最大值是否过期
 *      2. 新增加的值从队尾开始，把所有比它小的值丢掉
 *
 * Created by Drelang on 2019/03/30 11:18
 */
class Solution {
    ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (size < 1 || size > num.length)
            return result;

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i=0; i<num.length; i++) {
            int begin = i - size + 1;
            if (deque.isEmpty()) {
                deque.add(i);
            }
            else {
                while (!deque.isEmpty() && begin > deque.peekFirst()) {   // 队列最大值不在窗口内
                    deque.pollFirst();
                }
            }

            while (!deque.isEmpty() && num[i] > num[deque.peekLast()]) {    // 从队列尾弹出小于当前的数组的值的数
                deque.pollLast();
            }
            deque.add(i);

            if (begin >= 0)  //窗口合法，记录当前最大值
                result.add(num[deque.peekFirst()]);
        }

        return result;
    }
}
