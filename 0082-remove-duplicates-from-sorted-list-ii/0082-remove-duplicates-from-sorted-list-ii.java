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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode k = new ListNode(0);
        k.next = head;
        ListNode h = k;
        while(h.next!=null)
        {
            ListNode c = h.next;
            while(c.next!=null && c.val==c.next.val)
                c = c.next;
            if(c!=h.next)
                h.next = c.next;
            else
                h = h.next;       
        }
        return k.next;
        
    }
}