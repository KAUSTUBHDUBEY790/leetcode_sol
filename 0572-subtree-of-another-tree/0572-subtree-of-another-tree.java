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
    public boolean isidentical(TreeNode root,TreeNode sroot)
    {
        if(root==null && sroot==null)
            return true;
        if(root==null || sroot==null || root.val!=sroot.val)
        {
            return false;
        }
        if(!isidentical(root.left,sroot.left))
            return false;
        if(!isidentical(root.right,sroot.right))
            return false;
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
        {
            return false;
        }
        if(root.val == subRoot.val)
        {
            if(isidentical(root,subRoot))
                return true;
        }
        return isSubtree(root.left,subRoot)|| isSubtree(root.right,subRoot);
        
    }
}