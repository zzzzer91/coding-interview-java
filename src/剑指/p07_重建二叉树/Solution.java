package 剑指.p07_重建二叉树;

import 剑指.common.TreeNode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                var node = new TreeNode(inorder[i]);
                node.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + i), Arrays.copyOfRange(inorder, 0, i));
                node.right = buildTree(Arrays.copyOfRange(preorder, 1 + i, preorder.length), Arrays.copyOfRange(inorder, i + 1, inorder.length));
                return node;
            }
        }
        return null;
    }
}
