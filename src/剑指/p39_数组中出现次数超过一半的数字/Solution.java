package 剑指.p39_数组中出现次数超过一半的数字;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 */
class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != res) {
                count--;
                if (count == 0) {
                    res = nums[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }
        return res;
    }
}
