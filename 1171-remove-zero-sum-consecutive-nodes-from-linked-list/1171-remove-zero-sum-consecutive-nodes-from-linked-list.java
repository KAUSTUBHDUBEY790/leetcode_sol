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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> a = new HashMap<>();
        ListNode front = new ListNode(0,head);
        a.put(0,front);
        int s =0;
        ListNode start = front;
        while(start!=null)
        {
            s+=start.val;
            a.put(s,start);
            start = start.next;
        }
        start = front;
        s =0;
        while(start!=null)
        {
            s+=start.val;
            start.next = a.get(s).next;
            start = start.next;
        }
        return front.next;
        
        
        
    }
}