package cn.drelang.q57_2_continuousSequence;

import java.util.ArrayList;

/**
 * 问题：和为 s 的连续整数序列
 *      输入一个整数 s， 打印出所有和为 s 的连续正数序列（至少含有两个数）。
 *      例如，输入 15， 由于 1+2+3+4+5 = 4+5+6 = 7 +8 = 15，所以打印出 3 个连续序列
 *      1~5， 4~6， 7~8
 *
 * 解法：
 *      双指针法：
 *      1. 开始取 small 为 1， 取 big 为 2
 *      2. 当 small～big 之和小于 sum 时，增加 big
 *      3. 当 small～big 之和大于 sum 时，减去原有 small 的值，即增加 small 的位置
 *      4. 当 small～big 之和等于 sum 时，记录此时的序列
 *      5. 重复 2～4， 直到 small = (sum+1)/2
 *
 * Created by Drelang on 2019/03/29 21:37
 */
class Solution {
    ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int small = 1;
        int big = 2;
        while (small < (sum+1)/2) {
            if (getSum(small, big) == sum) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i=small; i<=big; i++)
                    temp.add(i);
                result.add(temp);
                small++;
            }
            else if (getSum(small, big) > sum) {
                small++;
            }
            else {
                big++;
            }
        }
        return result;
    }

    private int getSum(int small, int big) {
        return (small + big)*(big - small + 1) / 2;
    }
}
