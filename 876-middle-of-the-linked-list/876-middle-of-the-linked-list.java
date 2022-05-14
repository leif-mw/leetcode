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
    public ListNode middleNode(ListNode head) 
    {
        // Traverses the linked list to determine its size
        ListNode temp = head;
        int size = 0;
        while(temp.next != null)
        {
            temp = temp.next;
            size++;
        }
        
        // Calculates the index of the middle node of the linked list
        int mid = size / 2;
        if(size % 2 != 0)
            mid++;
        
        // Traverses the linked list again and stores a reference to the middle node in `head`
        for(int i = 0; i < mid; i++)
            head = head.next;
        
        return head;
    }
}