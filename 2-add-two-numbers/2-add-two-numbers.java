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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int sum = l1.val + l2.val;
        int carry;
        if(sum > 9)
            carry = 1;
        else
            carry = 0;
        sum = sum % 10;
        ListNode head = new ListNode(sum);
        ListNode curr = head;
        l1 = l1.next;
        l2 = l2.next;
        
        // Calculates the addition of each pair of nodes in l1 and l2 and builds a new reverse order list from the results
        while(l1 != null && l2 != null)
        {
            sum = l1.val + l2.val + carry;
            if(sum > 9)
                carry = 1;
            else
                carry = 0;
            sum = sum % 10;
            
            curr.next = new ListNode(sum);
            
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        // Accounts for the case when l1.size > l2.size
        while(l1 != null)
        {
            sum = l1.val + carry;
            if(sum > 9)
                carry = 1;
            else
                carry = 0;
            sum = sum % 10;
            curr.next = new ListNode(sum);
            
            curr = curr.next;
            l1 = l1.next;
        }
            
        // Accounts for the case when l1.size < l2.size
        while(l2 != null)
        {
            sum = l2.val + carry;
            if(sum > 9)
                carry = 1;
            else
                carry = 0;
            sum = sum % 10;
            curr.next = new ListNode(sum);
            
            curr = curr.next;
            l2 = l2.next;
        }
        
        // Finalizes the list
        if(carry == 1)
        {
            curr.next = new ListNode(1);
            curr = curr.next;
        }
        curr.next = null;
        
        return head;
    }
}