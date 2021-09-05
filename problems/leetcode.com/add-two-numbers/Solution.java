/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1.next, l2.next, l1.val + l2.val >= 10, new ListNode((l1.val + l2.val) % 10));
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2, boolean raised, ListNode result) {
        if (l1 == null && l2 == null) {
            if (raised) {
                result.next = new ListNode(1);
            }
            return result;
        }

        ListNode next = new ListNode();
        next.val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (raised ? 1 : 0);
        raised = next.val >= 10;
        next.val %= 10;

        result.next = addTwoNumbers((l1 == null ? null : l1.next), (l2 == null ? null : l2.next), raised, next);
        return result;
    }
}