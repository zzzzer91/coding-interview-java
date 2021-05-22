package 剑指.p29_顺时针打印矩阵;

/**
 * https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 */
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int m = matrix.length, n = matrix[0].length;
        int[] res = new int[m*n];
        int idx = 0;
        int tt = 0, bb = m-1, ll = 0, rr = n-1;
        while (ll <= rr && tt <= bb) {
            for (int i = ll; i <= rr; i++) {
                res[idx++] = matrix[tt][i];
            }
            for (int i = tt+1; i <= bb; i++) {
                res[idx++] = matrix[i][rr];
            }
            for (int i = rr-1; i >= ll && tt < bb; i--) {
                res[idx++] = matrix[bb][i];
            }
            for (int i = bb-1; i > tt && ll < rr; i--) {
                res[idx++] = matrix[i][ll];
            }
            ll++; rr--; tt++; bb--;
        }

        return res;
    }
}