package 剑指.p10_青蛙跳台阶问题;

/**
 * https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 */
class Solution {
    public int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = a;
            a = b;
            b = (tmp + b) % (int)(1e9 + 7);
        }
        return b;
    }
}
