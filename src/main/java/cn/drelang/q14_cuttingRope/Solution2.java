package cn.drelang.q14_cuttingRope;

/**
 * 贪婪算法：
 * 当 n >=5 时，我们尽可能多地剪长度为 3 的绳子；当剩下的绳子长度
 * 为 4 时，把绳子剪成两段长度为 2 的绳子。
 *
 * Created by Drelang on 2019/03/04 18:43
 */
class Solution2 extends Solution {
    @Override
    int maxProductAfterCutting(int length) {
        if (length < 2) return 0;
        if (length == 2) return 1;
        if (length == 3) return 2;
        if (length == 4) return 4;
        int timesOf3 = length / 3;
        if (length - timesOf3 * 3 == 1) {   // 说明有一段长度为 4 的绳子
            timesOf3--;
        }
        int timesOf2 = (length - timesOf3 * 3) / 2;

        return (int)Math.pow(3, timesOf3) * 2 * timesOf2;
    }
}
