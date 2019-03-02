package cn.drelang.q4_findIn2DArray;

/**
 * 问题:
 *   在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 *   每一列都按照从上到下递增的顺序排序。请完成一个函数，输入
 *   这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 解法:
 *   1. 首先选取数组右上角的数字，判断该数字是否是要查找的数字；
 *          若是要查找的数字，返回 true；
 *          若大于要查找的数字，则删除该数字所在的列；
 *          若小于要查找的数字，则删除该数字所在的行；
 *   2. 重复第一步，直到“遍历”该数组。
 *
 * Created by Drelang on 2019/03/02 14:49
 */
class Solution {
    boolean find(int[][] nums, int target) {
        if(nums == null) return false;
        int row =  nums.length;
        if(row < 1) return false;
        int col = nums[0].length;

        int i=0, j=col-1;
        while(i < row && j >= 0) {
            if(nums[i][j] == target) {  // 找到该数
                return true;
            }
            else if(nums[i][j] > target) {  // 该位置数字大于目标数
                --j;
            }
            else {  // 该位置数字小于目标数
                i++;
            }
        }
        return false;
    }
}
