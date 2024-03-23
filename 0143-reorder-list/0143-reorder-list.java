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
    public void reorderList(ListNode head) {
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        n >>= 1;
        curr = head;
        for(int i = 1; i < n; i++)    curr = curr.next;
        ListNode prev = curr;
        curr = curr.next;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        for(int i = 0; i < n; i++){
            ListNode next = head.next; 
            head.next = prev; 
            prev = prev.next; 
            head.next.next = next; 
            head = next;
        }
        head.next = null;
    }
}
