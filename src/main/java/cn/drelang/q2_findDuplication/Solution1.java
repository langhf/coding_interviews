package cn.drelang.q2_findDuplication;

import java.util.ArrayList;
import java.util.List;

/**
 * 用 ArrayList
 * 时间复杂度： O(n)
 * 空间复杂度： O(n)
 *
 * Created by Drelang on 2019/03/01 21:26
 */
class Solution1 extends Solution {
    @Override
    boolean duplicate(int[] numbers) {
        if(numbers == null ) return false;
        int n = numbers.length;

        for(Integer num : numbers) {
            if(num < 0 || num > (n-1))
                return false;
        }

        List<Integer> list = new ArrayList<>(n);
        for(Integer num : numbers) {
            if(!list.contains(num)) {
                list.add(num);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
