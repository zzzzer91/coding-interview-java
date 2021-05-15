package 剑指.p04_二维数组中的查找;

/**
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;
        while (i < m && j >= 0) {
            int val = matrix[i][j];
            if (val < target) {
                i++;
            } else if (val > target) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}