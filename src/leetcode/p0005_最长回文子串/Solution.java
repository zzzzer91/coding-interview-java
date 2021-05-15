package leetcode.p0005_最长回文子串;

/**
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
class Solution {
    // 暴力
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            var subS = getPalindrome(s, i, i); // 奇数
            res = maxStr(res, subS);
            subS = getPalindrome(s, i, i+1); // 偶数
            res = maxStr(res, subS);
        }
        return res;
    }

    String getPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--; j++;
        }
        return s.substring(i+1, j);
    }

    String maxStr(String s1, String s2) {
        if (s1.length() >= s2.length()) {
            return s1;
        }
        return s2;
    }
}