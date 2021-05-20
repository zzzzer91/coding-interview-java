package 剑指.p21_调整数组顺序使奇数位于偶数前面;

/**
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */
class Solution {
    public int[] exchange(int[] nums) {
        int l = 0, r = nums.length-1;
        while (l < r) {
            while (l < r && (nums[l] & 1) != 0) {
                l++;
            }
            while (l < r && (nums[r] & 1) == 0) {
                r--;
            }
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++; r--;
        }
        return nums;
    }
}