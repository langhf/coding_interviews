package cn.drelang.q14_cuttingRope;

/**
 * 题目：
 *   给你一根长度为n绳子，请把绳子剪成m段（m、n都是整数，n>1并且m≥1）。
 *   每段的绳子的长度记为k[0]、k[1]、……、k[m]。k[0]*k[1]*…*k[m]可能的最大乘
 *   积是多少？例如当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此
 *   时得到最大的乘积18。
 *
 * Created by Drelang on 2019/03/04 16:25
 */
abstract class Solution {
    abstract int maxProductAfterCutting(int length);
}
