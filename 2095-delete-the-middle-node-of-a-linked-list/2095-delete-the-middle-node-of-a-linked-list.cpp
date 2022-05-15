/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution 
{
public:
    ListNode* deleteMiddle(ListNode* head) 
    {
        // Traverses the list with two pointers to determine the middle node of the linked list
        ListNode* curr = head;
        ListNode* midPrev = head;
        int midPrevIdx = 0;
        int currSize = 0;
        while(curr != nullptr)
        {
            currSize++;
            curr = curr->next;
            
            if(midPrevIdx < currSize / 2 - 1)
            {
                midPrevIdx++;
                midPrev = midPrev->next;
            }
        }
        
        // Accounts for the cases when the list has only 1 or 2 elements 
        if(currSize == 1)
            return nullptr;
        if(currSize == 2)
        {
            head->next = nullptr;
            return head;
        }
        
        // Deletes the middle node from the list
        midPrev->next = midPrev->next->next;
            
        return head;
    }
};