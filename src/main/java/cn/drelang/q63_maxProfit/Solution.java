package cn.drelang.q63_maxProfit;

/**
 * 问题：股票的最大利润
 *      假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖
 *      该股票一次可能获得的最大利润是多少？例如，一只股票在某些
 *      时间节点的价格为 {9, 11, 8, 5, 7, 12, 16, 14},。如果我们能在价格
 *      为 5 的时候买入并在价格为 16 时卖出，则能收获最大的利润是 11.
 *
 * 解法：
 *      双指针法。
 *      1. slow 和 fast 开始在同一起点，然后 fast 先走，计算 a[fast] - a[slow] 的值
 *          若差值大于零，记录下当前收益；若差值小于零，则 slow 移到 fast 处
 *      2. 循环步骤 1，fast 到达数组尾部
 *
 * Created by Drelang on 2019/03/30 18:43
 */
class Solution {
    int maxDiff(int[] nums) {
        if (nums == null || nums.length < 1)
            return 0;

        int slow=0, fast=0, maxValue=0;

        while (++fast < nums.length) {
            int diff = nums[fast] - nums[slow];
            if (diff>0) {
                maxValue = Math.max(maxValue, diff);
            }
            else {
                slow = fast;
            }
        }
        return maxValue;
    }
}
