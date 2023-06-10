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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> a = new ArrayList<>();
        String s = Integer.toString(root.val);
        if(root.left==null && root.right==null)
        {
            a.add(s);
        } 
        dfs(root.left,s,a);
        dfs(root.right,s,a);
        return a;
    }
    public void dfs(TreeNode r,String s,List<String> a)
    {
        if(r== null)
            return;
        s+="->";
        s+=Integer.toString(r.val);
        if(r.left==null && r.right==null)
        {
            a.add(s);
            return;
        }    
        dfs(r.left,s,a);
        dfs(r.right,s,a);
    }
}