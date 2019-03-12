package cn.drelang.q38_stringPermutation;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 问题：字符串的排列
 *   输入一个字符串，打印出该字符串中字符的所有排列。例如输入字符串abc，
 *   则打印出由字符a、b、c所能排列出来的所有字符串abc、acb、bac、bca、cab和cba。
 *
 * 解法：
 *  固定一个字符，然后将该字符与其他字符交换
 *
 * Created by Drelang on 2019/03/12 14:55
 */
class Solution {
    ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null || str.length() < 1)
            return result;
        char[] chars = str.toCharArray();
        TreeSet<String> temp = new TreeSet<>();
        Permutation(chars, 0, temp);
        result.addAll(temp);
        return result;

    }

    private void Permutation(char[] chars, int begin, TreeSet<String> result) {
        if (begin>=chars.length || begin<0) {
            return;
        }
        if (begin == chars.length-1) {
            result.add(String.valueOf(chars));
        }
        else {
            for (int i=begin; i<chars.length; i++) {
                swap(chars, begin, i);
                Permutation(chars, begin+1, result);
                swap(chars, begin, i);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
