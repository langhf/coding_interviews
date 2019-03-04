package cn.drelang.q15_numberOf1InBinary;

/**
 * 解法：
 *   用 1 去与原数做与运算，若与的结果为 1 ，则说明该位为 1；
 *   将 1 左移一位，再与原数做与运算，知道 1 循环移动了 int 的字节长度。
 *
 * Created by Drelang on 2019/03/04 19:29
 */
class Solution1 extends Solution {
    @Override
    int NumberOf1(int n) {
        int flag = 1;
        int result = 0;
        while (flag != 0) {
            if ((flag & n) != 0) {
                result++;
            }
            flag <<=1;
        }
        return result;
    }
}
