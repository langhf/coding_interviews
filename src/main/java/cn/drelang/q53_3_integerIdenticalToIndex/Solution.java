package cn.drelang.q53_3_integerIdenticalToIndex;

/**
 * 题目：数组中数值和下标相等的元素
 *      假设一个单调递增的数组里的每个元素都是整数并且是唯一的。
 *      请编程实现一个函数找出数组中任意一个数值等于其下标的元素。
 *      例如：在数组 {-3, -1, 1, 3, 5}中，数字3和它的下标相等。
 *
 * 解法：
 *      二分查找法
 *      1. 若 array[mid] > mid ，则去左边查找，end = mid -1；
 *      2. 若 array[mid] < mid ，则去右边查找，start = mid + 1;
 *      3. 若 array[mid] == mid , 则找到；
 *      4. 否则，找不到，返回 -1.
 *
 * Created by Drelang on 2019/03/29 10:53
 */
class Solution {
    int getNumberSameAsIndex(int[] array) {
        if (array == null)
            return -1;
        return getNumberSameAsIndex(array, 0, array.length-1);
    }

    private int getNumberSameAsIndex(int[] array, int start, int end) {
        if (start > end)
            return -1;
        int mid = (start+end)>>1;
        if (array[mid] == mid) {
            return mid;
        }
        else if (array[mid] < mid) {
            start = mid + 1;
            return getNumberSameAsIndex(array, start, end);
        }
        else {
            end = mid - 1;
            return getNumberSameAsIndex(array, start, end);
        }
    }
}
