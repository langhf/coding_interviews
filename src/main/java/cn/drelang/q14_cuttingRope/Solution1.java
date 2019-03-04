package cn.drelang.q14_cuttingRope;

/**
 * 动态规划：
 * 从上往下分析问题，从下往上解决问题。
 * 1. 定义 f(n) 为最优解，则 f(n) = max(f(i)*f(n-i))，其中 0<i<n
 * 2. 自下而上计算， f(2), f(3) ... 直到 f(n)
 * 3. 分析可知 f(2) = 1, f(3) = 2
 *
 * Created by Drelang on 2019/03/04 16:26
 */
public class Solution1 extends Solution {
    @Override
    int maxProductAfterCutting(int length) {
        if(length < 2) return 0;
        if(length < 3) return 1;
        if(length < 4) return 2;
        int[] products = new int[length+1];
        // f(n) 与 products(i) 有区别！
        // f(n) 表示长度为 n 的绳子的最优解，必须要剪一下；
        // 而 products(i) 表示将绳子剪过后的最优解，不是非要再剪一下！
        products[1] = 1;
        products[2] = 2;
        products[3] = 3;
        for(int i = 4; i<=length; i++) {
            int max = 0;
            for(int j=1; j<=i/2; j++) {    // 大问题的最优解为小问题的最优解
                int temp = products[j] * products[i-j];
                max = Math.max(max, temp);
            }
            products[i] = max;
        }
        return products[length];
    }
}
