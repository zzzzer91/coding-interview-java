package leetcode.p0027_移除元素;

class Solution {
    public int removeElement(int[] nums, int val) {
        int pos = 0;
        for (int num : nums) {
            if (num != val) {
                nums[pos++] = num;
            }
        }
        return pos;
    }
}
