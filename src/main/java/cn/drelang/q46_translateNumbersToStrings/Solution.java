package cn.drelang.q46_translateNumbersToStrings;

/**
 * 问题：把数字翻译成字符串
 *      给定一个数字，我们按照如下规则把它翻译为字符串：0翻译成"a"，1翻
 *      译成"b"，……，11翻译成"l"，……，25翻译成"z"。一个数字可能有多个翻译。例
 *      如12258有5种不同的翻译，它们分别是"bccfi"、"bwfi"、"bczi"、"mcfi"和
 *      "mzi"。请编程实现一个函数用来计算一个数字有多少种不同的翻译方法。
 *
 *  解法：
 *      用动态规划的思想。
 *      f(i) = f(i-1) + f(i-2) * g(i-1, i) ，其中 i > 1, f(0) = 1, f(1) = 1.
 *      f(i) 可能的情况为在 f(i-1) 的基础上看 i-1 和 i 位能否结合。
 *
 * Created by Drelang on 2019/03/18 14:59
 */
public class Solution {
    int getTranslationCount(int number) {
        if (number < 0)
            return 0;
        String str =  String.valueOf(number);
        int[] f = new int[str.length()+1];
        f[0] = 1;
        f[1] = 1;
        for (int i=1; i<str.length(); i++) {
            int temp = Integer.parseInt(str.substring(i-1,i+1));
            if (temp >=0 && temp <= 25) {
                f[i+1] = f[i-1] + f[i];
            }
            else {
                f[i+1] = f[i];
            }
        }
        return f[str.length()];
    }
}
