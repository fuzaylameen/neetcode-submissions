/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Node copy=new Node(0);
        copy.val=head.val;
        Node tail=copy;
        Node curr=head.next;
        while(curr!=null){
            tail.next=new Node(curr.val);
            tail=tail.next;
            curr=curr.next;
        } 

        HashMap<Node,Node> map=new HashMap<>();
        Node temp1=head;
        Node temp2=copy;
        while(temp1!=null){
            map.put(temp1,temp2);
            temp1=temp1.next;
            temp2=temp2.next;
        }

        temp1=head;
        temp2=copy;
        while(temp1!=null){
            temp2.random=map.get(temp1.random);
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return copy;


        
    }
}
