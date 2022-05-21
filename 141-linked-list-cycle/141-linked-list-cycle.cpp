/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution 
{
public:
    bool hasCycle(ListNode *head) 
    {
        if(head == nullptr)
            return false;
            
        ListNode* fast = head;
        
        while(fast->next != nullptr)
        {
            fast = fast->next;
            if(fast->next == nullptr)
                return false;
            fast = fast->next;
            head = head->next;
            
            if(head == fast)
                return true;
        }
        
        return false;
    }
};