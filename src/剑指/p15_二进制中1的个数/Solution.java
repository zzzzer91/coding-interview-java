package 剑指.p15_二进制中1的个数;

/**
 * https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public int hammingWeight2(int n) {
        int res = 0;
        while(n != 0) { //
            res++;
            n &= n - 1;
        }
        return res;
    }
}
