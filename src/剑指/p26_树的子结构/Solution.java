package 剑指.p26_树的子结构;

import 剑指.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 */
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        return f(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    boolean f(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        return A.val == B.val && f(A.left, B.left) && f(A.right, B.right);
    }
}