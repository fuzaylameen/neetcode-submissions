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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3=new ListNode();
        ListNode head=list3;
        if(list1==null && list2==null) return null;
        else if(list2==null) return list1;
        else if(list1==null) return list2;

        while(list1!=null || list2!=null){
            ListNode temp=new ListNode();
            if( list2==null){
                temp.val=list1.val;
                list1=list1.next;
                list3.next=temp;
                list3=temp;
            }
            else if(list1==null){
                temp.val=list2.val;
                list2=list2.next;
                list3.next=temp;
                list3=temp;
            }

            else if(list1.val<list2.val){
                temp.val=list1.val;
                list1=list1.next;
                list3.next=temp;
                list3=temp;
            }
            else if(list1.val>list2.val){
                temp.val=list2.val;
                list2=list2.next;
                list3.next=temp;
                list3=temp;
            }
            else if(list1.val==list2.val){
                temp.val=list1.val;
                list1=list1.next;
                list3.next=temp;
                list3=temp;
            }
            else break;

        }
        return head.next;
        
    }
}