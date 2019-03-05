package cn.drelang.q16_power;

/**
 * 问题:
 *   实现函数 double power(double base, int exponent) , 求 base 的
 *   exponent 次方。不得使用库函数，同事不需要考虑大数问题。
 *
 * 解法:
 *   1. 考虑指数是负数的情况；
 *   2. 考虑基数为0且指数是负数的情况；
 *   3. 考虑用以下公式优化效率
 *          a^n = a^(n/2) * a^(n/2) ,  n为偶数；
 *          a^n = a^(n/2) * a^(n/2) * a , n为奇数。
 *   4. 考虑用位运算优化运算速度。
 *
 * Created by Drelang on 2019/03/05 09:55
 */
class Solution {
    double Power(double base, int exponent) {
        if (base == 0.0 && exponent < 0) return 0.0;
        int flag = 0;   // 看指数是否为负数
        if (exponent < 0) {
            flag = 1;
            exponent = -exponent;
        }
        double result = powerWithUnsignedExponent(base, exponent);
        if (flag == 1) result = 1/result;
        return result;
    }

    private double powerWithUnsignedExponent(double base, int exponent) {
        if (exponent == 0) return 1;
        if (exponent == 1) return base;

        double result = powerWithUnsignedExponent(base, exponent>>1);
        result *= result;
        if((exponent & 1) == 1) {   // 判断 exponent 是否为基数
            result *= base;
        }
        return result;
    }
}
