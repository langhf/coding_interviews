package cn.drelang.q40_kLeastNumbers;

import java.util.ArrayList;


/**
 * 解法：
 *   利用 Partition 函数将数组中前 k-个最小的数排到左边，将其余
 *   的数排到右边。这种方法找到的前 k 个最小的数是无序的。其次，
 *   这种方法改变了原来的输入数组。
 *
 * Created by Drelang on 2019/03/13 09:20
 */
class Solution1 extends Solution {
    @Override
    ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || k>input.length || k<=0)
            return list;
        int start = 0;
        int end = input.length-1;
        int index = partion(input, start, end);
        while (index != k-1) {  // 下标 k-1 之前的数都比 k-1 上的数小。包括 第 k-1 个数则刚好 k 个数
            if (index < k-1) {
                start = index+1;
                index = partion(input, start, end);
            }
            else {
                end = index-1;
                index = partion(input, start, end);
            }
        }

        for (int i=0; i<k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    // 返回 k，其中数组下标小于 k 的数小于下标大于 k 的数
    private int partion(int[] nums, int start, int end) {
        if (nums == null || nums.length < 1 || start < 0 || end >= nums.length)
            return -1;
        int index = start + (int) (Math.random() * (end - start + 1));
        swap(nums, index, end);     //将随机取的下标的数放到数组尾，方便遍历数组
        int small = start-1;
        for (int i = start; i < end; i++) {
            if (nums[i] < nums[end]) {
                small++;
                if (small != i) {    // 若小的数不在小的下标处，则将小的数换到小的下标处
                    swap(nums, small, i);
                }
            }
        }
        small++;
        swap(nums, small, end);
        return small;
    }

    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

