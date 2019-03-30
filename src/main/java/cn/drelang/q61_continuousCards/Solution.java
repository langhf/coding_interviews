package cn.drelang.q61_continuousCards;

import java.util.Arrays;

/**
 * 问题：扑克牌中的顺子
 *      从扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这 5 张牌是不是连续的。
 *      2 ～ 10为数字本身， A 为 1， J 为 11， Q 为 12， K 为 13，而
 *      大王、小王可以看成任意数字。
 *
 * 解法：
 *      大王小王看成 0 ：
 *      1. 先将数组值排序；
 *      2. 统计数组中 0 的个数，计算正常牌之间的差值
 *      3. 若 0 的个数不小于差值和，则是顺子；否则，不是顺子
 *      注意：发现相同的牌则一定不是顺子
 *
 * Created by Drelang on 2019/03/30 15:12
 */
class Solution {
    boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length < 1)
            return false;

        Arrays.sort(numbers);
        int zeros = 0;
        for (int i : numbers) {
            if (i == 0)
                ++zeros;
        }

        int gaps = 0;
        for (int i=0; i<numbers.length-1; i++) {
            if (numbers[i] != 0) {
                if (numbers[i] == numbers[i+1])  // 发现相同的牌
                    return false;
                else {
                    gaps += numbers[i+1] - numbers[i] - 1;
                }
            }
        }

        return zeros >= gaps;
    }
}
