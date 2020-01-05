package offer.p03_数组中重复的数字;

/**
 * https://www.acwing.com/problem/content/14/
 */
public class Solution {
    public int duplicateInArray(int[] nums) {
        for (int num : nums) {
            if (num < 0 || num >= nums.length) {
                return -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]);
            int val = nums[idx];
            if (val < 0) {
                return idx;
            }
            nums[idx] = -Math.abs(val);
        }
        return -1;
    }
}