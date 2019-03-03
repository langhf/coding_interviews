package cn.drelang.q10_1_fibonacci;

/**
 * 写一个函数，输入 n ，求斐波那契( Fibonacci) 数列的第 n 项。
 * 斐波那契数列的定义如下：
 *      f(n) = 0, n=0;
 *      f(n) = 1, n=1;
 *      f(n) = f(n-2) + f(n-1), n>1.
 *
 * Created by Drelang on 2019/03/03 14:19
 */
abstract class Solution {
    abstract int Fibonacci(int n);
}
