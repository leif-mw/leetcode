/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution 
{
    public ListNode MiddleNode(ListNode head) 
    {
        ListNode curr = head;
        int len = 0;
        int mid = 0;
        while(head != null)
        {
            if(len / 2 > mid)
            {
                curr = curr.next;
                mid++;
            }
            
            head = head.next;
            len++;
        }
        
        return len % 2 == 0 ? curr.next : curr;
    }
}