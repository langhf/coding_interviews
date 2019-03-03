package cn.drelang.q03_findDuplication;

/**
 * 逐位比较置换
 * 空间复杂度： O(1)
 * 时间复杂度： O(n)
 * 缺点：修改了原来的数组
 *
 * Created by Drelang on 2019/03/01 21:43
 */
class Solution2 extends Solution {
    @Override
    boolean duplicate(int[] numbers) {
        if(numbers == null ) return false;
        int n = numbers.length;

        for(Integer num : numbers) {
            if(num < 0 || num > (n-1))
                return false;
        }

        for(int i=0; i<n; i++) {
            while(i != numbers[i]) {
                int val = numbers[i];
                if( val == numbers[val]) {  // 判断该位置与要移到的位置的值是否相等
                    return true;
                }

                // 两个位置的数字进行交换
                numbers[i] = numbers[val];
                numbers[val] = val;
            }
        }
        return false;
    }
}
