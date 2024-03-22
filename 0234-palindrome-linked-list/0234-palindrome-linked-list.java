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
    public boolean isPalindrome(ListNode head) {
        ListNode p = head;
        ListNode n = head;
        while(n!=null && n.next!=null)
        {
            p = p.next;
            n = n.next.next;
        }
        n = null;
        ListNode c = p;
        while(c!=null)
        {
            ListNode a = c.next;
            c.next = n;
            n = c;
            c = a;
        }
        while(n!=null && head!=null)
        {

            if(n.val != head.val)
                return false;
         n = n.next;
         head = head.next;
        }
        // if(c!=null || head!=null)
        //     return false;
        return true;

        
    }
}