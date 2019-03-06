package cn.drelang.q21_reorderArray;

/**
 * 问题:
 *   输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *   使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *   例如： {1, 2, 3, 4, 5}  --> {1, 3, 5, 2, 4}
 *
 * 解法：
 *   双指针法。
 *   1. 第一个指针开始指数组头，第二个指针开始指向数组尾。第一个
 *       指针从头开始向后移动，遇到偶数则停住：
 *          若此时第二个指针指向奇数，则交换两个指针的内容，第一个
 *              指针向后移动一步，第二个指针向前移动一步；
 *          若此时第二个指针指向偶数，则第二个指针继续向前移动；
 *    2. 当第一个指针小于第二个指针时，重复第1步。
 *
 * Created by Drelang on 2019/03/06 09:34
 */
class Solution {
    void reOrderArray(int [] array) {
        if (array == null || array.length < 1) return;
        int i = 0;
        int j = array.length - 1;
        while(i < j) {
            while (i < j && isOdd(array[i])) { // i 指向奇数
                i++;
            }

            while (i < j && !isOdd(array[j])) {
                j--;
            }

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }

    private boolean isOdd(int number) {
        return (number & 0x1) == 1;
    }
}
