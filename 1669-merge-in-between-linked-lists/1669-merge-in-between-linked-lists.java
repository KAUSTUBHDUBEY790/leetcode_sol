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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode k = new ListNode(0);
        ListNode l = new ListNode(0);
        ListNode n = new ListNode(0);
        n.next = list1;
        ListNode h = list1;
        for(int i=0;i<=b;i++)
        {
            if(i==a)
                k = n;
            if(i==b)
                l = h.next;
            n = n.next;
            h = h.next;    
        }
        k.next = list2;
        h = list1;
        while(h.next!=null)
            h = h.next;
        h.next = l;
        return list1;
        
    }
}