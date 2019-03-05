package cn.drelang.q20_isNumeric;

/**
 * 数字的格式可以用 A[.[B]][e|EC] 或者 .B[e|EC] 表示， 其中 A 和 C都是
 * 整数（可以有正负号，也可以没有），而 B 是一个无符号整数。
 *
 * Created by Drelang on 2019/03/05 19:35
 */
class Solution2 extends Solution {
    private int index=0;
    @Override
    boolean isNumeric(char[] str) {
        index = 0;
        if (str == null || str.length < 1) return false;
        boolean flag = scanInteger(str);
        if ( index < str.length && str[index] == '.') {
            index++;
            flag = scanUnsignedInteger(str) || flag;    // 此处 flag 一定要放在后面，不然 scanUnsignedInteger 可能会被短路
        }

        if (index < str.length && (str[index] == 'e' || str[index] == 'E')) {
            index++;
            flag = flag && scanInteger(str);
        }
        return flag && (index == str.length);
    }

    private boolean scanInteger(char[] str) {
        if (index < str.length && (str[index] == '+' || str[index] == '-')) {
            index++;
        }
        return scanUnsignedInteger(str);
    }

    private boolean scanUnsignedInteger(char[] str) {
        int start = index;
        while (index < str.length && str[index] <= '9' && str[index] >= '0') {
            index++;
        }
        return start < index;
    }
}
