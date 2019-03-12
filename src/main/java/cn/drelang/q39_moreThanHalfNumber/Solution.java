package cn.drelang.q39_moreThanHalfNumber;

/**
 * 问题：数组中出现次数超过一半的数字
 *   数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例
 *   如输入一个长度为9的数组{1, 2, 3, 2, 2, 2, 5, 4, 2}。由于数字2在数组中
 *   出现了5次，超过数组长度的一半，因此输出2。
 *
 * 解法：
 *   若存在数量超过数组长度一半的数，则该数比其他数字数量之和还要多。
 *   可以取一个数字，设其次数为 1 ，当它后面的数字不与他相等时，将次数减 1；
 *   当它后面的数字与他相等时，将次数加 1；若次数为零，则设置数字为当前数字，
 *   次数设为 1.
 *
 * Created by Drelang on 2019/03/12 21:16
 */
class Solution {
    int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length < 1)
            return 0;

        int num = array[0];
        int times = 1;
        for (int ele : array) {
            if (times == 0) {
                num = ele;
                times = 1;
            }
            else if (ele == num) {
                times++;
            }
            else {
                times--;
            }
        }

        if (checkMoreThanHalf(array, num))
            return num;
        else
            return 0;
    }

    private boolean checkMoreThanHalf(int[] array, int num) {
        int times = 0;
        for (int ele : array) {
            if (ele == num)
                times++;
        }

        return times*2 > array.length;
    }
}
