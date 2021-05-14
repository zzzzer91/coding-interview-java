package leetcode.p0014_最长公共前缀;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int minStrLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (minStrLen > strs[i].length()) {
                minStrLen = strs[i].length();
            }
        }

        for (int i = 0; i < minStrLen; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minStrLen);
    }
}
