package 剑指.p06_从尾到头打印链表;

import 剑指.common.ListNode;

/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null) {
            ++count;
            node = node.next;
        }
        int[] nums = new int[count];
        node = head;
        for (int i = count - 1; i >= 0; i--) {
            nums[i] = node.val;
            node = node.next;
        }
        return nums;
    }
}