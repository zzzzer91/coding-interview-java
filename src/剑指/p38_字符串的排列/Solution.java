package 剑指.p38_字符串的排列;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 */
class Solution {
    public String[] permutation(String s) {
        Set<String> list = new HashSet<>();
        char[] arr = s.toCharArray();
        boolean[] visited = new boolean[arr.length];
        dfs(arr, "", visited, list);
        return list.toArray(new String[0]);
    }

    public void dfs(char[] arr, String s,  boolean[] visited, Set<String> list) {
        if (s.length() == arr.length) {
            list.add(s);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(arr, s+arr[i], visited, list);
            visited[i] = false;
        }
    }
}
