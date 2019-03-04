package cn.drelang.q15_numberOf1InBinary;

/**
 * 解法：
 *   原理：一个整数减去 1 后，其二进制表示中最后一个 1 变成了 0，最后一个 1 后面的位变成了 1，前面的位不变。
 *   把一个整数减去 1，再和原整数做与运算，会把该整数最右边的那个 1 变成 0。依次减1，直到原来的数变为零。
 *
 * Created by Drelang on 2019/03/04 19:43
 */
class Solution2 extends Solution {
    @Override
    int NumberOf1(int n) {
        int result = 0;
        while(n != 0) {
            result++;
            n &= (n-1);
        }
        return result;
    }
}
