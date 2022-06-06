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
    int minDepth(TreeNode* root) 
    {
        if(!root)
            return 0;
        queue<TreeNode*> queue; queue.push(root);
        int depth = 1;
        while(!queue.empty())
        {
            int n = queue.size();
            while(n--)
            {
                TreeNode* curr = queue.front(); queue.pop();
                if(curr->left)
                    queue.push(curr->left);
                if(curr->right)
                    queue.push(curr->right);
                else if(!curr->left)
                    return depth;
            }
            
            depth++;
        }
        
        return -1;
    }
};