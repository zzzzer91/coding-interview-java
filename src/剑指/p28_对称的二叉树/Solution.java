package 剑指.p28_对称的二叉树;

import 剑指.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return f(root.left, root.right);
    }

    boolean f(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && f(p.left, q.right) && f(p.right, q.left);
    }
}