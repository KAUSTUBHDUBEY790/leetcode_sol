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
    public boolean isValidBST(TreeNode root) {
        return isbst(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean isbst(TreeNode r,long max,long min)
    {
        if(r==null)
            return true;
        if(min<r.val && r.val<max)
        {
            boolean l = isbst(r.left,r.val,min);
            boolean ri = isbst(r.right,max,r.val);
            return l && ri;
        }
        else{
            return false;
        }
        
    }
}