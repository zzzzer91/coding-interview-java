package 剑指.p48_最长不含重复字符的子字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Map<Character, Integer> m = new HashMap<>();
        int lastIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            lastIdx = Math.max(lastIdx, m.getOrDefault(c, 0));
            res = Math.max(res, i-lastIdx+1);
            m.put(c, i+1);
        }
        return res;
    }
}
