package leetcode.p0015_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length-2; k++) {
            // 最小的值已经大于 0，三者相加不可能再等于 0
            if (nums[k] > 0) break;
            // 跳过使用过的相同元素
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length-1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    // 直到找到不一样的值
                    while (i < j && nums[i] == nums[++i]);
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]);
                } else {
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    // 因为不允许返回相同值的对
                    // 所以要过滤掉
                    while (i < j && nums[i] == nums[++i]);
                    while (i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }
}
