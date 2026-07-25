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
    public void reorderList(ListNode head) {
        ListNode half=head;
        ListNode curr=head;
        int count=0;
        if(curr.next==null) return;
        while(curr!=null && curr.next!=null){
            curr=curr.next.next;
            half=half.next;
            count+=2;
        }
        if(curr!=null) count++;
        curr=head;
        int i=0;
        while(i<(count/2)-1) {
            curr=curr.next;
            i++;
        }
        curr.next=null;
        ListNode prev=null;
        ListNode nex=null;
        while(half!=null){
            nex=half.next;
            half.next=prev;
            prev=half;
            half=nex;
        }

        half=prev;
        curr=head;
        ListNode dummy=head;
        i=0;
        while(i<count/2){
            if(dummy==head){
                dummy=curr;
                curr=curr.next;
            }
            else {
                dummy.next=curr;
                curr=curr.next;
                dummy=dummy.next;
            }
            dummy.next=half;
            half=half.next;
            dummy=dummy.next;
            i++;
        }
        dummy.next=half;

        
    }
}
