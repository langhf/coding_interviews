package cn.drelang.q10_1_fibonacci;

/**
 * 用循环方式，从下往上计算。
 * Created by Drelang on 2019/03/03 14:27
 */
class Solution2 extends Solution {
    @Override
    int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int fnMinusTwo = 0;     // f(n-2)
        int fnMinusOne = 1;     // f(n-1)
        int fn = fnMinusTwo + fnMinusOne;
        for(int i=2; i<=n; i++) {
            fn = fnMinusTwo + fnMinusOne;
            // 下一次计算的 fnMinusTwo 和 fnMinusOne
            fnMinusTwo = fnMinusOne;
            fnMinusOne = fn;
        }
        return fn;
    }
}
