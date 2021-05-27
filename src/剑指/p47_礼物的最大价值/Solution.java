package 剑指.p47_礼物的最大价值;

/**
 * https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 */
class Solution {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] += grid[i][j-1];
                } else if (j == 0) {
                    grid[i][j] += grid[i-1][j];
                } else {
                    grid[i][j] += Math.max(grid[i-1][j], grid[i][j-1]);
                }
            }
        }
        return grid[m-1][n-1];
    }
}
