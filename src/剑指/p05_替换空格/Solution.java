package 剑指.p05_替换空格;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */
class Solution {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (var c : s.toCharArray()) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}