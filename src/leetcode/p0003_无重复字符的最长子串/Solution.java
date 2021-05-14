package leetcode.p0003_无重复字符的最长子串;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int[] indexs = new int[128];
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            pos = Math.max(pos, indexs[c]);
            res = Math.max(res, i-pos+1);
            indexs[c] = i + 1;
        }
        return res;
    }
}
