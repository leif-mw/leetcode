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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ListNode head = new ListNode();
        ListNode curr = head;
        
        while(true)
        {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            
            for(int i = 0; i < lists.length; i++)
            {
                if(lists[i] != null && lists[i].val < min)
                {
                    min = lists[i].val;
                    idx = i;
                }
            }
            
            if(min == Integer.MAX_VALUE)
                break;
            
            curr.next = new ListNode(min);
            curr = curr.next;
            lists[idx] = lists[idx].next;
        }
        
        return head.next;
    }
}