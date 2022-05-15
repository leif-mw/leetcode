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
    ListNode* middleNode(ListNode* head) 
    {
        // Traverses the list with two pointers to determine the middle node of the linked list
        ListNode* curr = head;
        ListNode* mid = head;
        int midIdx = 0;
        int currSize = 0;
        while(curr != nullptr)
        {
            currSize++;
            curr = curr->next;
            
            if(midIdx < currSize / 2)
            {
                midIdx++;
                mid = mid->next;
            }
        }
        
        return mid;
    }
};