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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        ListNode dummy=head;
        ListNode tr=dummy;
        int count=0;
        while(dummy!=null){
            count++;
            dummy=dummy.next;
        }
        
        if(k>count) k=k%count;
        if(k==0 || k==count) return head;
        k=count -k;

        dummy=head;
        while(dummy.next!=null){
            if(k>1){
                k--;
                dummy=dummy.next;
                continue;
            }
            else if(k==1){
                tr=dummy;
                dummy=dummy.next;
                tr.next=null;
                tr=dummy;
                k=-1;
                continue;
            }
            else dummy=dummy.next;
            
        }
        dummy.next=head;
        return tr;
        
    }
}