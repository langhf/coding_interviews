package cn.drelang.q56_1_numbersAppearOnce;

/**
 * 问题：数组中只出现一次的两个数字
 *      一个整型数组里除两个数字之外，其他数字都出现了两次。
 *      请写程序找出这两个只出现一次的数字。要求时间复杂度是 O(n)，
 *      空间复杂度是 O(1) 。
 *
 * 解法：
 *      数字与自身异或后变为零。将数组分为两组，每组当中有一个不
 *      成对的数字。
 *
 * Created by Drelang on 2019/03/29 15:15
 */
class Solution {
    void FindNumsAppearOnce(int[] array,int[] num1 , int[] num2) {
        if (array == null || array.length < 2)
            return;

        int temp = 0;
        for (int i : array)
            temp ^= i;

        int indexBit = findFirstBits(temp);

        for (int i : array) {
            if (isBit(i, indexBit)) {
                num1[0] ^= i;
            }
            else {
                num2[0] ^= i;
            }
        }
    }

    private int findFirstBits(int num) {
        int index = 0;
        while ((num & 1) == 0 && index <= 4*8) {
            num >>= 1;
            index++;
        }
        return index;
    }

    private boolean isBit(int num, int indexBit) {
        return ((num >> indexBit) & 1) == 1;
    }
}
