package 剑指.p12_矩阵中的路径;

/**
 * https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
 */
class Solution {
    private char[][] board;
    private char[] word;
    private int m;
    private int n;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        this.board = board;
        this.word = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int u, int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] != word[u]) {
            return false;
        }
        if (word.length-1 == u) return true;
        char tmp = board[x][y];
        board[x][y] = '\0';
        u += 1;
        boolean res = dfs(u, x+1, y) || dfs(u, x-1, y) || dfs(u, x, y+1) || dfs(u, x, y-1);
        board[x][y] = tmp;
        return res;
    }
}