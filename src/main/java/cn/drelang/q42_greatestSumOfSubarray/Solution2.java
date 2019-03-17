package cn.drelang.q42_greatestSumOfSubarray;

/**
 * 动态规划
 *
 * Created by Drelang on 2019/03/17 12:07
 */
class Solution2 {
    int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length < 1)
            return 0;

        int[] f = new int[array.length];
        f[0] = array[0];
        int max = f[0];
        int i=1;
        while (i<array.length) {
            if (f[i-1] < 0)
                f[i] = array[i];
            else {
                f[i] = f[i-1] + array[i];
            }
            max = Math.max(f[i], max);
            i++;
        }
        return max;
    }
}
