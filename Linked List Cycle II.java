/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        int k=0;
        while(f!=null && f.next!=null)
        {

            f=f.next.next;
            s = s.next;
            if(f==s)
            {
            k=1;
            break;
            }
        }
        if(k==1)
        {
            s = head;
            while(s!=f)
            {
                s=s.next;
                f=f.next;
            }
            return f;
        }
        return null;
    }
}
