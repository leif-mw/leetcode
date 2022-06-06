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
    vector<double> averageOfLevels(TreeNode* root) 
    {
        vector<double> averages;
        queue<TreeNode*> queue; queue.push(root);
        while(!queue.empty())
        {
            double levelSum = 0;
            int n = queue.size();
            for(int i = n; i; i--)
            {
                TreeNode* curr = queue.front(); queue.pop();
                levelSum += curr->val;
                if(curr->left)
                    queue.push(curr->left);
                if(curr->right)
                    queue.push(curr->right);
            }
            
            averages.push_back(levelSum / n);
        }
        
        return averages;
    }
};