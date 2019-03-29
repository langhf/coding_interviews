package cn.drelang.q53_2_missingNumber;

/**
 * 问题：0～n-1 中缺失的数字
 *      一个长度为 n-1 的递增排序数组中的所有数字都是唯一的，并且每个
 *      数字都在范围 0～n-1 之内，在范围 0～n-1 内的 n 个数字中有且只有
 *      一个数字不在该数组中，请找出该数字。
 *
 * 解法：
 *      在缺失的数字处，数值与数组下标不同
 *      1. 用二分查找，若 array[mid] == mid，则 start = mid + 1;
 *      2. 若 array[mid] != mid ，则 end = mid，若同时 array[mid-1]  == mid - 1
 *              则找到缺失的数字
 *
 * Created by Drelang on 2019/03/29 10:36
 */
class Solution {
    int getMissingNumber(int[] array) {
        if (array == null)
            return -1;
        return getMissingNumber(array, 0, array.length-1);
    }

    private int getMissingNumber(int[] array, int start, int end) {
        if (start > end)
            return -1;
        int mid = (start+end)>>1;
        if (array[mid] != mid) {
            if (mid-1 >=0 && array[mid-1] == mid-1)
                return mid;
            else {
                end = mid - 1;
                return getMissingNumber(array, start, end);
            }
        }
        else {
            start = mid + 1;
            return getMissingNumber(array, start, end);
        }
    }
}
