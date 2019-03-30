package cn.drelang.q62_lastNumberInCircle;

import java.util.LinkedList;

/**
 * 问题：0, 1, ..., n-1 这 n 个数字排成一个圆圈，从数字 0 开始，每次
 * 从这个圆圈里删除第 m 个 数字。求出这个圆圈里剩下的最后一个数字。
 *
 * 解法一：
 *      用 list 来模拟环
 *      1. 将前 n 个数加入 list；
 *      2. 设定一个 index = -1， 记录要删除的数字的位置。
 *      3. index 移动 m 步，若遇到尾部，则移到头部
 *      4. 重复一直到 list 只剩一个元素
 *
 * 解法二：
 *      找规律
 *      1. 定义关于 n 和 m 的方程 f(n,m)，表示每次在 n 个数字 0, 1, ... , n-1 删除
 *          第 m 个数字最后剩下的数字. 则 f`(n-1,m) = f(n,m) 。
 *      2. 假设删除的是 k，则重排列原数组为 k+1, k+2, ...., k-1 ，将该数组映射成
 *          0, 1, 2, ... , n-2 。 即做以下运算： j = (x-k-1)%n，该映射的逆映射为 p`(x) = (x+k+1)%n
 *      3. 则 f`(n-1,m) = p`[f(n-1,m)] = [f(n-1,m)+k+1]%n, 把 k=(m-1)%n 代入可得
 *          f(n,m) = [f(n-1,m)+m]%n, 当n > 1;
 *          f(n,m) = 0, 当 n = 1。
 *
 * Created by Drelang on 2019/03/30 16:33
 */
class Solution {
    int LastRemaining_Solution(int n, int m) {
        if (n<1 || m<1)
            return -1;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0; i<n; i++)
            list.add(i);

        int index = 0;
        while (list.size() > 1) {
            for (int i=1; i<m; i++) {
                index++;
                if (index > list.size()-1)    // 超出则回到起点
                    index = 0;
            }

            list.remove(index);
            if (index > list.size()-1)
                index = 0;
        }
        return list.get(0);
    }

    int LastRemaining(int n, int m) {
        if (n<1 || m<1)
            return -1;

        int last = 0;
        for (int i=2; i<=n; i++) {
            last = (last+m) % i;    // 注意是 i，而不是 n。因为分析的时候只分析了 n 的情况
        }
        return last;
    }
}
