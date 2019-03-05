package cn.drelang.q19_match;

/**
 * 问题:
 *   请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字
 *   符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次
 *   （包含0次）。
 *   在本题中，匹配是指字符串的所有字符匹配整个模式。
 *   例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 *
 * 解法:
 *   每次取出一个字符与模式中的字符去匹配。
 *   当模式中的第二个字符不为 '*' 时，问题很简单，逐一比较即可；
 *   当模式中的第二个字符为 '*' 时，就要分情况讨论了：
 *          有可能 '*' 代表的是 0
 *          有可能 '*' 代表的是 1
 *          有可能 '*' 代表的 > 1
 *
 * Created by Drelang on 2019/03/05 14:42
 */
class Solution {
    boolean isMatch(String s, String p) {
        if(p.isEmpty()) return  s.isEmpty();
        boolean firstMatch = ( !s.isEmpty() &&
                ( p.charAt(0) == s.charAt(0) || p.charAt(0) == '.') );
        if( p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2))   // * 代表 0
                    || (firstMatch && isMatch(s.substring(1), p));  //  * 代表 > 1
        }
        else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));   // 正常移到下一个状态
        }
    }
}
