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
    public ListNode swapNodes(ListNode head, int k) 
    {
        // Creates a pointer to the kth node from the beginning of the list
        ListNode curr = head;
        for(int i = 1; i < k; i++)
            curr = curr.next;
        ListNode kthFromBeg = curr;
        
        // Creates a pointer to the kth node from the end of the list
        ListNode kthFromEnd = head;
        while(curr.next != null)
        {
            curr = curr.next;
            kthFromEnd = kthFromEnd.next;
        }
        
        // Swaps the values of the nodes
        int temp = kthFromBeg.val;
        kthFromBeg.val = kthFromEnd.val;
        kthFromEnd.val = temp;
        
        return head;
    }
}