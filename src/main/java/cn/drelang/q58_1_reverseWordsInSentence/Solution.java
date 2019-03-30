package cn.drelang.q58_1_reverseWordsInSentence;

/**
 * 问题：翻转单词顺序
 *      输入一个英文句子，翻转句子中单词的顺序，但单词内容的顺序
 *      不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串
 *      "I am a student."，则输出 "student. a am I".
 *
 * 解法：
 *      先翻转整个句子，然后翻转每个单词，以空格作为分隔符。
 *
 * Created by Drelang on 2019/03/30 09:55
 */
class Solution {
    String ReverseSentence(String str) {
        if (str == null || str.length() == 0 || str.trim().length() == 0)
            return str;
        String[] reAll = reverse(str).split(" ");
        StringBuilder result = new StringBuilder();
        for (int i=0; i<reAll.length; i++) {
            result.append(reverse(reAll[i]));
            if (i != reAll.length-1)
                result.append(" ");
        }
        return result.toString();
    }

    private String reverse(String string) {
        if (string == null)
            return "";
        StringBuilder str = new StringBuilder(string);
        for (int i=0; i<str.length()/2; i++) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(str.length()-1-i));
            str.setCharAt(str.length()-1-i, temp);
        }
        return str.toString();
    }
}
