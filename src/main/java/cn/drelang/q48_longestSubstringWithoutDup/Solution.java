package cn.drelang.q48_longestSubstringWithoutDup;

import java.util.ArrayList;

/**
 * 问题：最长不含重复字符的子字符串
 *      请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子
 *      字符串的长度。假设字符串中只包含从'a'到'z'的字符。
 *
 *  解法：
 *      解法一：双指针
 *      解法二：动态规划
 *
 * Created by Drelang on 2019/03/19 11:00
 */
class Solution {
    int longestSubstringWithoutDup(String str) {
        if (str == null || str.length() < 1)
            return 0;
        ArrayList<Character> list = new ArrayList<>();
        int maxLength = 0;
        int j=0;
        while (j<str.length()) {
            char ch = str.charAt(j++);
            if (list.contains(ch)) { // 发现重复的字符
                maxLength = Math.max(list.size(), maxLength);
                list.clear();
            }
            list.add(ch);
        }
        maxLength = Math.max(maxLength, list.size());
        return maxLength;
    }
}
