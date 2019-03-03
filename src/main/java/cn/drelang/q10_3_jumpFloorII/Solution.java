package cn.drelang.q10_3_jumpFloorII;

/**
 * 问题:
 *   在青蛙跳台阶的问题中，如果把条件改成: 一只青蛙一次可以跳上
 *   1 级台阶，也可以跳上 2 级 ... 它也可以跳上 n 级，此时该青蛙跳
 *   上一个 n 级的台阶总共有多少种跳法。
 *
 * 解法:
 *   跟之前一样分析可知: f(n) = f(n-1) + f(n-2) + ... + f(2) + f(1).
 *   其中，f(2) = 2, f(1) = 1.
 *
 * Created by Drelang on 2019/03/03 14:53
 */
class Solution {
    int JumpFloorII(int target) {
        if(target < 2) return 1;
        int[] fn = new int[target+1];
        fn[0] = 1;
        fn[1] = 1;
        for(int i=2; i<=target; i++) {
            fn[i] = 0;
            for(int j=0; j<i; j++) {
                fn[i] += fn[j];
            }
        }
        return fn[target];
    }
}
