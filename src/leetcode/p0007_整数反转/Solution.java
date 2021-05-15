package leetcode.p0007_整数反转;

/**
 * https://leetcode-cn.com/problems/reverse-integer/
 */
class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int)res;
    }
}
