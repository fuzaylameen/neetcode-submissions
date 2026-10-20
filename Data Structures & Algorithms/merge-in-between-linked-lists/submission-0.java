class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0, list1);
        ListNode temp1 = dummy;
        for (int i = 0; i < a; i++) {
            temp1 = temp1.next;
        }
        ListNode temp2 = temp1;
        for (int i = a; i <= b + 1; i++) {
            temp2 = temp2.next;
        }
        temp1.next = list2;
        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = temp2;

        return dummy.next;
    }
}