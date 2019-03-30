package cn.drelang.q58_2_leftRotateString;

/**
 * 问题：坐旋转字符串
 *      字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的
 *      尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入
 *      字符串 "abcdefg" 和数字 2，该函数将返回左旋转两位得到的结果
 *      "cdefgab"。
 *
 * 解法：
 *      用 substring
 *
 * Created by Drelang on 2019/03/30 10:39
 */
class Solution {
    String LeftRotateString(String str,int n) {
        if (str == null || n >str.length())
            return "";
        StringBuilder result = new StringBuilder();
        result.append(str.substring(n));
        result.append(str.substring(0, n));
        return result.toString();
    }
}
