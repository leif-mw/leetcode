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
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null)
        {
            fast = fast.next;
            
            if(fast.next == null)
                return null;
            fast = fast.next;
            slow = slow.next;
            
            if(slow == fast)
            {
                slow = head;
                while(slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}