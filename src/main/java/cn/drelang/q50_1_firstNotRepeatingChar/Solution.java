package cn.drelang.q50_1_firstNotRepeatingChar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 问题：字符串中第一个只出现一次的字符
 *      在字符串中找出第一个只出现一次的字符。如输入"abaccdeff"，则输出 'b'。
 *
 * 解法：
 *      解法一：构建一个大小为 256 的 布尔矩阵
 *      解法二：直接用 Map
 *
 * Created by Drelang on 2019/03/19 14:13
 */
class Solution {
    int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() < 1) {
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();  // 存字符和字符出现的次数
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int time = map.get(ch);
                map.put(ch, time+1);
            }
            else {
                map.put(ch, 1);
            }
        }

        int position=-1;
        for (int i=0; i<str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                position = i;
                break;
            }
        }
        return position;
    }
}
