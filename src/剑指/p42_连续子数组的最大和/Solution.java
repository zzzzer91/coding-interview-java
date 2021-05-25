package 剑指.p42_连续子数组的最大和;

/**
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int n : nums) {
            sum = Math.max(sum, 0) + n;
            res = Math.max(res, sum);
        }
        return res;
    }
}