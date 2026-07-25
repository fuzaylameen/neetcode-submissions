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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=head;
        int count=0;
        while(dummy!=null){
            count++;
            dummy=dummy.next;
        }
        int index=count-n;
        if(index==0){
            head=head.next;
            return head;
        }
        else{
            ListNode curr=head;
            index-=1;
            for(int i=0;i<index;i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        return head;
    }
}
