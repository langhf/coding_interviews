package cn.drelang.q66_constructArray;

/**
 * 问题：构建乘积数组
 *      给定一个数组 A[0,1,...,n-1], 请构建一个数组 B[0,1, .., n-1], 其中 B
 *      中的元素 B[i]=A[0] * A[1] * .. * A[i-1] * A[i+1]* .. * A[n-1]. 不能使用除法。
 *
 * 解法：
 *      借助动态规划的思想，减少重复计算。
 *      B0  1   A1  A2  A3  ...     An-2    An-1
 *      B1  A0  1   A2  A3  ..      An-2    An-1
 *      B2  A0  A1  1   A3  ..      An-2    An-1
 *      B3  A0  A1  A2  1   ...     An-2    An-1
 *      ...
 *      Bn-2    A0    A1  A2  ...     1       An-1
 *      Bn-1    A0  A1  A2  ...      An-2       1
 *
 *     可以设 Bi = Ci * Di，则 Bi+1 = Ci+1 * Di+1. 其中
 *          自上而下 Ci+1 = Ci * Ai,  自下而上Di+1 = Di * Ai
 *
 * Created by Drelang on 2019/03/31 10:52
 */
class Solution {
    int[] multiply(int[] A) {
        if (A == null || A.length < 1)
            return null;

        int[] result = new int[A.length];
        int[][] temp = new int[A.length][2];
        temp[0][0] = 1; //初始化 C0
        temp[A.length-1][1] = 1;    //初始化 Dn-1

        for (int i=0; i<A.length; i++) {
            if (i>0) {  //跳过 C0
                temp[i][0] = temp[i-1][0] * A[i-1];
            }

            if (i<A.length-1) { //跳过 Dn-1
                temp[A.length-2-i][1] = temp[A.length-1-i][1] * A[A.length-1-i];
            }
        }

        for (int i=0; i<A.length; i++) {
            result[i] = temp[i][0] * temp[i][1];
        }
        return result;
    }
}
