package leetcode.p0003_无重复字符的最长子串;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        int[] indexs = new int[128];
        for (int r = 0, l = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            l = Math.max(l, indexs[c]);
            indexs[c] = r + 1;
            ret = Math.max(ret, r-l+1);
        }
        return ret;
    }
}
