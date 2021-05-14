package leetcode.p0007_整数反转;

class Solution {
    public int reverse(int x) {
        long ret = 0;
        while (x != 0) {
            ret = ret * 10 + x % 10;
            if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int)ret;
    }
}
