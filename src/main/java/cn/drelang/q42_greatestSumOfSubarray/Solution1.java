package cn.drelang.q42_greatestSumOfSubarray;

/**
 * 问题：连续子数组的最大和
 *   输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整
 *   数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为O(n)。
 *
 * 解法：
 *   方法1：动态规划
 *          若 f(i-1) < 0, 则 f(i) = num[i]
 *          若 f(i-1) >= 0, 则 f(i) = f(i-1) + num[i]
 *   方法2：双指针法
 *          1. 两个指针同起点，记此时最大值为第一个元素。
 *          2. 前指针先走一步，若加上前指针现在的值要比和最大值小，
 *               则前指针移动一步，后指针移到前指针位置。
 *            3. 循环步骤2，直到数组末尾。
 *
 * Created by Drelang on 2019/03/17 11:22
 */
class Solution1 {
    int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length < 1) return 0;
        int fast = 0;
        int slow = 0;
        int max = array[0];
        while (fast < array.length) {
            int sum = array[slow];
            max = Math.max(max, sum);
            while (++fast < array.length) {
                sum += array[fast];
                if (sum < 0){
                    ++fast;
                    slow = fast;
                    break;
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
