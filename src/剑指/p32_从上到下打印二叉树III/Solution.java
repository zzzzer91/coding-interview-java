package 剑指.p32_从上到下打印二叉树III;

import 剑指.common.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            for (int i = q.size(); i > 0; i--) {
                if (flag) {
                    root = q.pollLast();
                    if (root.right != null) {
                        q.offerFirst(root.right);
                    }
                    if (root.left != null) {
                        q.offerFirst(root.left);
                    }
                } else {
                    root = q.poll();
                    if (root.left != null) {
                        q.offer(root.left);
                    }
                    if (root.right != null) {
                        q.offer(root.right);
                    }
                }
                level.add(root.val);
            }
            res.add(level);
            flag = !flag;
        }
        return res;
    }
}