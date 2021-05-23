package 剑指.p34_二叉树中和为某一值的路径;

import 剑指.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        dfs(res, comb, root, target);
        return res;
    }

    void dfs(List<List<Integer>> res, List<Integer> comb, TreeNode root, int target) {
        if (root == null) {
            return;
        }
        comb.add(root.val);
        target -= root.val;
        if (target == 0 && (root.left == null && root.right == null)) {
            res.add(new ArrayList<>(comb));
        } else {
            dfs(res, comb, root.left, target);
            dfs(res, comb, root.right, target);
        }
        comb.remove(comb.size()-1);
    }
}