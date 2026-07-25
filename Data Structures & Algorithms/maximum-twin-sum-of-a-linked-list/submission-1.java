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
    public int pairSum(ListNode head) {

        if(head==null) return 0;
        ListNode half=head;
        ListNode end=head;

        while(end!=null){
            half=half.next;
            end=end.next.next;
        }

        ListNode current=half;
        ListNode prev=null;
        ListNode next=null;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        int max=0;
        while(prev!=null){
            int sum= head.val+prev.val;
            if(sum>max) max=sum;
            head=head.next;
            prev=prev.next;
        }

        return max;
        
    }
}