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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
            return null;
        ListNode h = head;
        int k=0;
        ListNode a = head;
        while(a!=null)
        {
            k++;
            a = a.next;
        } 
        if(k-n==0)
        {
            return head.next;
        }
        k = k-n;
        while(h!=null)
        {
            
            if(k==1)
            {h.next = h.next.next;
             break;
            }
            k--;
            h = h.next;
        }
        return head;     
    }
}