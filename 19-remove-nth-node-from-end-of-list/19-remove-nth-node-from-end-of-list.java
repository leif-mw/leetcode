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
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        // Advances a first pointer and advances it n elements into the list
        ListNode ptr1 = head;
        for(int i = 0; i < n; i++)
            ptr1 = ptr1.next;
        
        // Accounts for the case when n = sz (the number of nodes in the list)
        if(ptr1 == null)
            return head.next;
        
        // Creates a second pointer that remains n nodes behind the first pointer, and advances the first pointer until the end of the list
        ListNode ptr2 = head;
        while(ptr1.next != null)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        // Accounts for the case when n = 1
        if(n == 1)
        {
            ptr2.next = null;
            return head;
        }
        
        // Removes the nth node from the end of the list
        ptr2.next = ptr2.next.next;
        
        return head;
    }
}