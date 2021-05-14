package leetcode.p0042_接雨水;

class Solution {
    public int trap(int[] height) {
        int res = 0;
        int l = 0, r = height.length-1;
        int lMax = 0, rMax = 0;
        while (l <= r) {
            int lVal = height[l], rVal = height[r];
            if (lVal < rVal) {
                lMax = Math.max(lMax, lVal);
                res += lMax - lVal;
                l++;
            } else {
                rMax = Math.max(rMax, rVal);
                res += rMax - rVal;
                r--;
            }
        }
        return res;
    }
}
