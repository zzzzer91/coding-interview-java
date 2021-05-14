package leetcode.p0002_两数相加;

import leetcode.common.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0);
        ListNode p = fakeHead;
        int val = 0;
        while (l1 != null || l2 != null || val != 0) {
            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(val % 10);
            val /= 10;
            p = p.next;
        }
        return fakeHead.next;
    }
}
