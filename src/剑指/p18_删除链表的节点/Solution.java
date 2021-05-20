package 剑指.p18_删除链表的节点;

import 剑指.common.ListNode;

/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode fakeHead = new ListNode();
        fakeHead.next = head;
        ListNode p = fakeHead;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return fakeHead.next;
    }
}