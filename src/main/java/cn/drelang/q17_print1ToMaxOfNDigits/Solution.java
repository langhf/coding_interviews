package cn.drelang.q17_print1ToMaxOfNDigits;

/**
 * 问题:
 *   输入数字 n，按顺序打印从 1 到最大的 n 位十进制数。
 *   比如输入 3，则打印出 1, 2, 3, ... , 999。
 *
 * 解法:
 *   把数字的每一位都从 0 到 9排列一遍，就得到了所有的十进制数。
 *
 * Created by Drelang on 2019/03/05 12:24
 */
class Solution {
    private char[] number;

    void print1ToMaxOfNDigits(int n) {
        if (n<=0) return;
        number = new char[n];
        for(int i=0; i<10; i++) {
            number[0] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursively(n, 0);
        }
    }

    private void print1ToMaxOfNDigitsRecursively(int n, int index) {
        if (index == n-1) {
            printNumber();
            return;
        }
        for (char i=0; i<10; i++) {
            number[index+1] = (char) (i+'0');
            print1ToMaxOfNDigitsRecursively(n, index+1);
        }
    }

    private void printNumber() {
        boolean isBeginning0 = true;
        for (char ch : number) {
            if (isBeginning0 && ch != '0' ) {    // 判断是不是数字前面的 0
                isBeginning0 = false;
            }
            if(!isBeginning0) System.out.print(ch);
        }
        System.out.println();
    }
}
