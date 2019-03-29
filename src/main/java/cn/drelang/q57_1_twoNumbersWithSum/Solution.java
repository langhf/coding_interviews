package cn.drelang.q57_1_twoNumbersWithSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 问题：和为 s 的两个数字  ( leetcode 第一题 )
 *      输入一个递增排序的数组和一个数字，在数组中查找两个数，使得
 *      它们的和正好是 s。如果有多对数字的和为 s ，输入任意一对即可。
 *
 * 解法：
 *      用一个 Map 存储下所有的数组，然后查看是否存在要查找的数字；
 *      优化：
 *              每判断数组中的一个新数字的时候，就查看 map 里面是否存在要查找的数字。
 *
 * Created by Drelang on 2019/03/29 21:12
 */
class Solution {
    ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : array) {
            int target = sum - i;
            if (map.containsKey(target)) {
                list.add(target);
                list.add(i);
                break;
            }
            else {
                map.put(i, 1);
            }
        }
        return list;
    }
}
