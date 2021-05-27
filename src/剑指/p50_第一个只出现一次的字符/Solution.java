package 剑指.p50_第一个只出现一次的字符;

/**
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */

class Solution {
    public char firstUniqChar(String s) {
        int[] m = new int[26];
        for (int i = 0; i < s.length(); i++) {
            m[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (m[s.charAt(i)-'a'] == 1) return s.charAt(i);
        }
        return ' ';
    }
}