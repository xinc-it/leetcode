package array.prefixsum;

import java.util.Arrays;

/**
 * Date：2023/2/11
 * Description：https://leetcode.cn/problems/range-sum-query-2d-immutable/
 * 难点：前缀和数组，二维数组
 *
 * @author xinC
 * @version 1.0
 */
public class NumMatrix {
    
    //前缀和数组sums[i][j]表示martix[i-1][j-1]范围内的和
    public int[][] sums;

    public NumMatrix(int[][] matrix) {
        //初始化前缀和数组
        sums = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //计算前缀和数组值
                sums[i + 1][j + 1] = matrix[i][j] + sums[i][j + 1] + sums[i + 1][j] - sums[i][j];
            }
        }
        for (int i = 0; i < sums.length; i++) {
            System.out.println(Arrays.toString(sums[i]));
        }
    }

    /**
     * 计算指定区间数组内的和
     *
     * @param row1
     * @param col1
     * @param row2
     * @param col2
     * @return
     */
    public int sumRegion(int row1, int col1, int row2, int col2) {
        //sum[row1,row2][col1,col2]
        //sum[0,row2][0,col2]-sum[0,row1-1][0,col2]-sum[0,row2][0,col1-1]+sum[0,row1-1][0,col1-1]
        return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] -
                sums[row2 + 1][col1]
                + sums[row1][col1];
    }
}
