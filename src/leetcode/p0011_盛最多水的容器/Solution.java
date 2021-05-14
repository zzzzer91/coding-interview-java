package leetcode.p0011_盛最多水的容器;

class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            if (height[l] < height[r]) {
                res = Math.max(res, height[l]*(r-l));
                l++;
            } else {
                res = Math.max(res, height[r]*(r-l));
                r--;
            }
        }
        return res;
    }
}
