package 剑指.p10_斐波那契数列;

/**
 * https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
 */
class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = a;
            a = b;
            b = (tmp + b) % (int)(1e9 + 7);
        }
        return b;
    }
}
