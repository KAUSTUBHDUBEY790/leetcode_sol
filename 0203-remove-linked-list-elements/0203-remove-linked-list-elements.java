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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        return null;
        ListNode k = new ListNode();
        k.next = head;
        ListNode prev = k;
        ListNode cur = head;
        while(cur!=null)
        {
            if(cur.val==val)
            {
                prev.next = cur.next;
            }
                
            else
            prev = cur;

            cur = cur.next;
        }
        return k.next;


    }
}