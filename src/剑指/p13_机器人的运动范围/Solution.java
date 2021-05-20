package 剑指.p13_机器人的运动范围;

/**
 * https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 */
class Solution {

    int m;
    int n;
    int k;
    boolean[] st;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.st = new boolean[m*n];
        return dfs(0, 0);
    }

    int dfs(int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n || st[x*n+y]) {
            return 0;
        }
        st[x*n+y] = true;
        if (!isCanEnter(x, y)) {
            return 0;
        }
        return dfs(x+1, y) + dfs(x, y+1) + 1;
    }

    boolean isCanEnter(int x, int y) {
        return compute(x) + compute(y) <= k;
    }

    int compute(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}