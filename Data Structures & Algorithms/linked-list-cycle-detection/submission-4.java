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
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(slow!=null){
            slow=slow.next;
            if(fast==null || fast.next==null)return false;
            else fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
