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
class Solution {
    public int sumLeft(TreeNode root,boolean left)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null && left)
        {
            return root.val;
        }
        return sumLeft(root.left,true)+sumLeft(root.right,false);
       
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int ans=sumLeft(root,false);
        return ans;

    }
}