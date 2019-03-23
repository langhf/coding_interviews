package cn.drelang.q53_1_numberOfK;

/**
 * 问题：数字在排序数组中出现的次数
 *  统计一个数字在排序数组中出现的次数。例如输入排序数组{1, 2, 3, 3,
 *  3, 3, 4, 5}和数字3，由于3在这个数组中出现了4次，因此输出4。
 *
 *  解法：
 *  采用二分法。
 *  1. 用二分法找到第一个 k ：
 *      若中间的数是k，且其左边的数字不为 k，则找到第一个 k
 *  2. 用二分法找到最后一个 k：
 *      若中间的数是k，且其右边的数字不为 k，则找到最后一个 k
 * Created by Drelang on 2019/03/22 16:47
 */
class Solution {
    int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length < 1)
            return -1;
        int count=0;
        for (int i : array){
            if(i == k)
                count++;
        }
        return count;
    }
}
