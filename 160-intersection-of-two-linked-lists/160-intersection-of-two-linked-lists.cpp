/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
#include <unordered_map>

class Solution 
{
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB)     
    {
        unordered_set<ListNode*> set;
        while(headA && headB)
        {
            if(!set.insert(headA).second)
                return headA;
            if(!set.insert(headB).second)
                return headB;
            headA = headA->next; headB = headB->next;
        }
        
        while(headA)
        {
            if(!set.insert(headA).second)
                return headA;
            headA = headA->next;
        }
        while(headB)
        {
            if(!set.insert(headB).second)
                return headB;
            headB = headB->next;
        }
        
        return nullptr;
    }
};