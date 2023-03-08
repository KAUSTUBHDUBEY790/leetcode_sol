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
        ListNode mid = head;
        ListNode k = head;
        while(k!=null && k.next!=null)
        {
            mid=mid.next;
            k=k.next.next;
        }
        ListNode prev = null;
        ListNode curr = mid;
        while(curr!=null)
        {
            ListNode a = curr.next;
            curr.next = prev;
            prev = curr;
            curr = a;
        }
        while(head!=null && prev!=null)
        {
            if(head.val!=prev.val)
            return false;
            head=head.next;
            prev=prev.next;
        }
        return true;
        
    }
}
