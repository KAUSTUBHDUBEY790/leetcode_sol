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
    int m=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        int k=1;
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;

        depth(root,k);
        return m;
    }
    public void depth(TreeNode root,int k)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
            m = Math.min(k,m);
            return; 
        }
        k++;
        depth(root.left,k);
        depth(root.right,k);
    }    
}