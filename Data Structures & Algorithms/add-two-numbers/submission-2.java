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

        int n = 0;

        ListNode l3 = new ListNode();
        ListNode head = l3;

        while (l1 != null || l2 != null) {

            ListNode temp = new ListNode();

            int sum = (l1 != null ? l1.val : 0)
                    + (l2 != null ? l2.val : 0)
                    + n;

            n = sum / 10;
            temp.val = sum % 10;

            l3.next = temp;
            l3 = l3.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (n != 0) {
            ListNode temp = new ListNode();
            temp.val = n;
            temp.next = null;
            l3.next = temp;
        }

        return head.next;
    }
}
