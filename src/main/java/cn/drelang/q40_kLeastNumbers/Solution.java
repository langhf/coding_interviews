package cn.drelang.q40_kLeastNumbers;

import java.util.ArrayList;

/**
 * 问题：最小的 k 个数
 *   输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 * Created by Drelang on 2019/03/13 09:17
 */
abstract class Solution {
    abstract ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k);
}
