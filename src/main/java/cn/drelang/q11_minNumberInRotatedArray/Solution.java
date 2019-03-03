package cn.drelang.q11_minNumberInRotatedArray;

/**
 * 问题:
 *   把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数
 *   组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组
 *   的最小元素。例如，数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋
 *   转，该数组的最小值为 1.
 *
 * 解法:
 *   用两个指针，一个指向数组左边，一个指向数组右边。
 *   1. left = 0, right = n-1;
 *   2. 取middle = (left+right)/2，做一下判断：
 *         若 nums[middle] > right，说明最小值在 middle 右边, 则 left = middle+1;
 *         若 nums[middle] = right，此时不能判断最小值在哪，但肯定不在 right 处，因此 right--;
 *         若 nums[middle] < left , 说明最小是在 middle 或者 middle 左边，则 right = middle。
 *   3. 重复步骤2，当 left < middle时。
 *   4. nums[left] 即为最小值。
 *
 * Created by Drelang on 2019/03/03 20:33
 */
class Solution {
    int minNumberInRotateArray(int [] array) {
        if(array == null) return 0;
        int n = array.length;
        if(n < 1) return 0;
        int left = 0;
        int right = n-1;
        while(left < right) {
            int middle = (left + right) / 2;
            if(array[middle] > array[right])
                left++;
            else if(array[middle] == array[right])
                right--;
            else
                right = middle;
        }
        return array[left];
    }
}