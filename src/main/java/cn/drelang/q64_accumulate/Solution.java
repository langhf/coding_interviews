package cn.drelang.q64_accumulate;

/**
 * 问题：求 1+2+ ... + n
 *      求 1+2+ ... + n，要求不能使用乘除法、for、while、if、else、switch、
 *      case 等关键字及条件判断语句(A?B:C)
 *
 * 解法：
 *      递归解法。用逻辑与终止递归循环。
 *
 * Created by Drelang on 2019/03/30 19:19
 */
class Solution {
    int Sum_Solution(int n) {
        if (n<1)
            return 0;

        int sum = n;
        boolean jud = (n>0) && ((sum+= Sum_Solution(n-1)) > 0);
        return sum;
    }
}
