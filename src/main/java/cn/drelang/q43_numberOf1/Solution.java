package cn.drelang.q43_numberOf1;

/**
 * 问题：从1到n整数中1出现的次数
 *   输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。例如
 *   输入12，从1到12这些整数中包含1 的数字有1，10，11和12，1一共出现了5次。
 *
 * Created by Drelang on 2019/03/17 14:55
 */
class Solution {
    int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        int i = 1;
        for (; i<n; i*=10) {
            int a = n/i;
            int b = n%i;
            count += (a+8)/10*i;
            if (a%10 == 1) {
                count += b+1;
            }
        }
        return count;
    }
}
