/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution 
{
public:
    int sumOfLeftLeaves(TreeNode* root) 
    {
        int sum = 0;
        stack<TreeNode*> stack; stack.push(root);
        while(!stack.empty())
        {
            TreeNode* curr = stack.top(); stack.pop();
            if(curr->right)
                stack.push(curr->right);
            if(curr->left)
            {
                if(!curr->left->left && !curr->left->right)
                    sum += curr->left->val;
                stack.push(curr->left);
            }
        }
        
        return sum;
    }
};