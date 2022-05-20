/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public TreeNode invertTree(TreeNode root) 
    {
        // Base case: Tree is empty
        if(root == null)
            return root;
        
        // Swaps the left and right subtrees of root
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // Recursively traverses the leftand right subtrees of root
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}