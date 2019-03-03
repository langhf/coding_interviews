package cn.drelang.q10_4_rectCover;

/**
 * 问题:
 *   我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。
 *   请问用 8 个 2*1 的小矩形无重叠地覆盖一个 2*8 的大矩形，总共
 *   有多少种方法？
 *
 * 解法:
 *   把 2*8 的覆盖方法记为 f(8)。若第一块矩形横着放，则必须有
 *   一块矩形需要横着放与其互补，则问题转为 2*6 的问题，即 f(6)；
 *   若第一块矩形竖着放，则问题转为 2*7 的问题，即 f(7)；
 *   因此 f(8) = f(7) + f(6)。还是斐波那契问题。
 *   其中， f(1) = 1, f(2) = 2.
 *
 * Created by Drelang on 2019/03/03 15:13
 */
class Solution {
    int rectCover(int target) {
        if(target < 3) return target;
        int fnMinusTwo = 1;
        int fnMinusOne = 2;
        int fn = fnMinusTwo + fnMinusOne;
        for(int i=3; i<=target; i++) {
            fn = fnMinusTwo + fnMinusOne;
            fnMinusTwo = fnMinusOne;
            fnMinusOne = fn;
        }
        return fn;
    }
}
