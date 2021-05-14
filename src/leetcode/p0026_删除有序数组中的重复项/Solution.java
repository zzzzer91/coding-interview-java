package leetcode.p0026_删除有序数组中的重复项;

class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pos] != nums[i]) {
                nums[++pos] = nums[i];
            }
        }
        return pos + 1;
    }
}
