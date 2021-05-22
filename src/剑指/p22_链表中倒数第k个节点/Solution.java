package 剑指.p22_链表中倒数第k个节点;

import 剑指.common.ListNode;

/**
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slowP = head, fastP = head;
        while (k > 0) {
            fastP = fastP.next;
            k--;
        }
        while (fastP != null) {
            slowP = slowP.next;
            fastP = fastP.next;
        }
        return slowP;
    }
}
