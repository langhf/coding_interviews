package cn.drelang.q05_replaceSpace;

/**
 * 问题:
 *   请实现一个函数，把字符串中的每个空格替换成“%20”。 例如：
 *   输入 “We are happy”， 则输出 “We%20are%20happy”。
 *
 * 解法：
 *   双指针，从后往前替换。
 *   1. 遍历原字符串，统计空格的个数，然后构建新字符串，长度为
 *          n + 2×k ，其中 n 为原字符串的长度， k 为空格个数。
 *    2. 第一个指针指向原字符串末尾，第二个指针指向新字符串末尾.
 *    3. 两个指针同时移动，第一个指针遇到空格时，第二个指针一步
 *        一步向前替换为 "0", "2", "%"。
 *    4. 重复步骤 3 直到从后往前遍历完整个字符串。
 *
 * Created by Drelang on 2019/03/02 16:04
 */
class Solution {
    String replaceSpace(StringBuffer str) {
        if(str == null) return null;
        int n = str.length();
        int spaces = 0;  //空格的个数
        // 统计空格的个数
        for(int i=0; i<n; i++) {
            if(str.charAt(i) == ' ') {
                ++spaces;
            }
        }
        //进行空格替换
        int capacityNew = n + 2*spaces;
        str.setLength(capacityNew);
        int j = n -1, k = capacityNew - 1;
        while(j >=0 && k >=0) {
            if(str.charAt(j) == ' ') {
                str.setCharAt(k--, '0');
                str.setCharAt(k--, '2');
                str.setCharAt(k--, '%');
                --j;
            }
            else {
                str.setCharAt(k--, str.charAt(j--));
            }
        }
        return str.toString();
    }
}