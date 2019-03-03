package cn.drelang.q10_1_fibonacci;

/**
 * 用递归方式
 *
 * Created by Drelang on 2019/03/03 14:25
 */
class Solution1 extends Solution {
    @Override
    int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return Fibonacci(n-2) + Fibonacci(n-1);
    }
}
