package cn.drelang.q65_addTwoNumbers;

/**
 * 问题：不用加减乘除做加法
 *      写一个函数，求两个整数之和，要求在函数体内不得使用“+”，
 *      “-”，“×”，“/” 四则运算。
 *解法：
 *      分三步
 *      1. 异或得到两个数字的不进位的位值
 *      2. 相与然后左移一位，得到进位的位值
 *      3. 重复1,2，直到没有进位。
 *
 * Created by Drelang on 2019/03/30 20:27
 */
class Solution {
    int Add(int num1,int num2) {
        int sum, carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        } while (num2 != 0);

        return sum;
    }
}
