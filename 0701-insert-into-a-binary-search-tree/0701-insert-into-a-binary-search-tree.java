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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        TreeNode p = null;
        TreeNode c = root;
        while(c!=null)
        {
            p = c;
            if(c.val>val)
                c = c.left;
            else
                c = c.right;
        }
        if(p.val>val)
        {
            TreeNode a = new TreeNode(val);
            p.left = a;
        }
        else
            {
            TreeNode a = new TreeNode(val);
            p.right = a;
        }
      return root;  
    }

}