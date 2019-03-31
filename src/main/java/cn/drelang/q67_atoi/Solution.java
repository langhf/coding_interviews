package cn.drelang.q67_atoi;

/**
 * 问题：把字符串转换成整数
 *      请写一个函数 strToInt，实现把字符串转换成整数。
 *
 * 解法：
 *      考虑边界条件
 *      1. 正负号出现在开头不是非法字符
 *      2. 当心整数溢出
 *
 * Created by Drelang on 2019/03/31 12:45
 */
class Solution {
    boolean overflow;   //判断是否溢出
    int StrToInt(String str) {
        long sum = 0;
        int flag = 1;
        overflow = false;   // 判断是否溢出

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                if (ch == '-') {
                    flag = -1;
                    continue;
                }
                else if (ch == '+') {
                    continue;
                }
                else if (ch > '9' || ch < '0') {
                    return 0;   //检测到非法字符
                }
            }

            if (ch <= '9' && ch >= '0') {
                sum = sum * 10 + ch - '0';
                if (flag * sum > Integer.MAX_VALUE || flag * sum < Integer.MIN_VALUE) {
                    overflow = true;
                    return 0;   //检测到溢出
                }
            }
            else {
                return 0;   //检测到非法字符
            }
        }

        return (int)sum * flag;
    }
}
