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
    public ListNode deleteMiddle(ListNode head) 
    {   
        // Traverses the linked list to determine its size
        ListNode temp = head;
        int size = 0;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        
        // Accounts for the cases when the list has only 1 or 2 elements 
        if(size == 1)
            return null;
        if(size == 2)
        {
            head.next = null;
            return head;
        }
        
        // Calculates the index of the middle node of the linked list
        int mid = size / 2;
        
        // Traverses the linked list again and removes its middle node
        temp = head;
        for(int i = 0; i < mid - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        
        return head;
    }
}