package cn.drelang.q45_sortArrayForMinNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 问题：把数组排成最小的数
 *   输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼
 *   接出的所有数字中最小的一个。例如输入数组{3, 32, 321}，则打印出这3个数
 *  字能排成的最小数字321323。
 *
 * 解法：
 *      将数组元素放入 lList 内，然后按照字符串的大小从小到大重排序。
 *
 * Created by Drelang on 2019/03/18 11:15
 */
class Solution {
    String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length < 1)
            return "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i);
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = "" + o1 + o2;
                String s2 = "" + o2 + o1;
                return s1.compareTo(s2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Integer num : list) {
            sb.append(num);
        }
        return sb.toString();
    }
}
