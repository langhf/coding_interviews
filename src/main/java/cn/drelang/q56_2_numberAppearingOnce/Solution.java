package cn.drelang.q56_2_numberAppearingOnce;

/**
 * 问题：数组中唯一只出现一次的数字
 *      在一个数组中除一个数字只出现一次之外，其他数字都出现了三次。
 *      请找出那个只出现一次的数字。
 *
 * 解法：
 *      用数组记录下每一位数字二进制中对应位 1 的个数之和。若能被3整除，
 *      则说明该位不是出现一次的数字所拥有的；否则，该为是出现一次的
 *      数字拥有的。
 *
 * Created by Drelang on 2019/03/29 16:05
 */
class Solution {
    int findNumberAppearingOnce(int[] array) {
        if (array == null)
            return -1;

        int[] bitSum = new int[32];
        for (int i : array) {
            for (int j=31; j>=0; j--) {
                if ( (i & 1) != 0)
                    bitSum[j] += 1;
                i >>= 1;
            }
        }

        int result = 0;
        for (int i : bitSum) {
            result <<= 1;   // 数组前面的实际上是高位数字，因此需要将上一次的结果左移
            result += i % 3;
        }

        return result;
    }
}
