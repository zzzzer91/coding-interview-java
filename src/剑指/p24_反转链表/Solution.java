package 剑指.p24_反转链表;

import 剑指.common.ListNode;

/**
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode fakeHead = new ListNode();
        while (head != null) {
            ListNode tmp = fakeHead.next;
            fakeHead.next = head;
            head = head.next;
            fakeHead.next.next = tmp;
        }
        return fakeHead.next;
    }
}