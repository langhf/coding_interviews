package cn.drelang.q10_2_jumpFloor;

/**
 * 问题:  青蛙跳台阶问题。
 *   一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级台阶。
 *   求该青蛙跳上一个 n 级台阶总共有多少种跳法。
 *
 * 解法:
 *   青蛙跳到 n 阶台阶的跳法数量为跳到 n-2 与 n-1 阶台阶的跳法之和。
 *   或者说，青蛙跳到 n 阶台阶的前一步，只能是跳到 n-2 阶台阶或者
 *   n-1 阶台阶。因为青蛙一次只能跳 1 级台阶或者 2 级台阶。
 *
 *   注意：f(0) = 1, f(1) = 1, f(2) = 2。这个与标准的斐波那契数列有点不一样。
 *
 * Created by Drelang on 2019/03/03 14:40
 */
class Solution {
    int JumpFloor(int target) {
        if (target < 2) return 1;
        int fnMinusTwo = 1;
        int fnMinusOne = 1;
        int fn = fnMinusTwo + fnMinusOne;
        for(int i=2; i<=target; i++) {
            fn = fnMinusTwo + fnMinusOne;
            fnMinusTwo = fnMinusOne;
            fnMinusOne = fn;
        }
        return fn;
    }
}
