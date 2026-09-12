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
        ListNode prev=null;
        while(l1!=null){
            ListNode next=l1.next;
            l1.next=prev;
            prev=l1;
            l1=next;
        }
        l1=prev;

        prev=null;
        while(l2!=null){
            ListNode next=l2.next;
            l2.next=prev;
            prev=l2;
            l2=next;
        }
        l2=prev;
        
        ListNode l3=new ListNode(0);
        ListNode dummy=l3;
        int rem=0;
        while(l1!=null || l2!=null){
            int sum=0;
            if(l1!=null) {
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            int temp=sum+rem;
            sum=(sum+rem)%10;
            rem=temp/10;
            
            l3.next=new ListNode(sum);
            l3=l3.next;
        }

        if(rem!=0){
            l3.next=new ListNode(rem);
        }

        l3= dummy.next;
        prev=null;
        while(l3!=null){
            ListNode next=l3.next;
            l3.next=prev;
            prev=l3;
            l3=next;
        }
        l3=prev;

        return l3;



        
    }
}