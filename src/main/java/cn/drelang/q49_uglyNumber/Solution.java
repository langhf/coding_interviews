package cn.drelang.q49_uglyNumber;

/**
 * 问题：丑数
 *      我们把只包含因子2、3和5的数称作丑数（Ugly Number）。求按从小到
 *      大的顺序的第1500个丑数。例如6、8都是丑数，但14不是，因为它包含因子7。
 *      习惯上我们把1当做第一个丑数。
 * 解法：
 *      用数组存下从小到大的丑数。用三个变量存下当前最小的 2倍数，3倍数，5倍数
 *
 * Created by Drelang on 2019/03/19 12:25
 */
class Solution {
    int GetUglyNumber_Solution(int index) {
        if (index <=0)
            return 0;
        int[] nums = new int[index];
        nums[0] = 1;
        int i = 0;
        int i2 = i;
        int i3 = i;
        int i5 = i;
        while (i++<index-1) {
            int min = Math.min(nums[i2]*2, Math.min(nums[i3]*3, nums[i5]*5));
            if (min % 2 == 0) i2++;     // 必须三个判断，因为存在 i2, i3, i5 相同的情况
            if (min % 3 == 0) i3++;
            if (min % 5 == 0) i5++;
            nums[i] = min;
        }
        return nums[index-1];
    }
}
