package cn.drelang.q20_isNumeric;

/**
 * 用正则表达式
 *
 * Created by Drelang on 2019/03/05 19:30
 */
class Solution1 extends Solution {
    @Override
    boolean isNumeric(char[] str) {
        String s = String.valueOf(str);
        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }
}
