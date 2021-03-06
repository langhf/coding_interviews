package cn.drelang.q03_findDuplication;

/**
 * 题目： 找出数组中重复的数字
 * 在一个长度为 n 的数组里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。例如，如果输入长度为 7 的数组 {2, 3, 1, 0, 2, 5, 3}，
 * 那么对应的输出是重复的数字 2 或者 3 。
 *
 * Created by Drelang on 2019/03/01 21:19
 */
abstract class Solution {
    abstract boolean duplicate(int[] numbers);
}
