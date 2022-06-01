/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution 
{
    public ListNode GetIntersectionNode(ListNode headA, ListNode headB) 
    {
        Dictionary<ListNode, int> nodesA = new Dictionary<ListNode, int>();
        while(headA != null)
        {
            nodesA.Add(headA, 0);
            headA = headA.next;
        }
        
        while(headB != null)
        {
            if(nodesA.ContainsKey(headB))
                return headB;
            headB = headB.next;
        }
        
        return null;
    }
}