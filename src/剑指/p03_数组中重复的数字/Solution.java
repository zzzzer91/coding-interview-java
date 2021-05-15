package 剑指.p03_数组中重复的数字;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return 0;
    }

    public int findRepeatNumber2(int[] nums) {
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