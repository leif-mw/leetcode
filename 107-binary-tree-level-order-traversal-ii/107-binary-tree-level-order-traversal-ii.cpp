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
    vector<vector<int>> levelOrderBottom(TreeNode* root) 
    {
        if(!root)
            return {};
        vector<vector<int>> res;
        queue<TreeNode*> queue; queue.push(root);
        while(!queue.empty())
        {
            int n = queue.size();
            vector<int> currLevel;
            while(n--)
            {
                TreeNode* curr = queue.front(); queue.pop();
                currLevel.push_back(curr->val);
                if(curr->left)
                    queue.push(curr->left);
                if(curr->right)
                    queue.push(curr->right);
            }
            
            res.push_back(currLevel);
        }
        
        reverse(res.begin(), res.end());
        return res;
    }
};