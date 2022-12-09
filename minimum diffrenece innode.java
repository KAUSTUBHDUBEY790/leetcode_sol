class Solution {
    public int maxAncestorDiff(TreeNode root) {
        int[] res = helper(root);
        return res[2];
    }
    
    // {min, max, res}
    private int[] helper(TreeNode root) {
        if (root == null) return null;
        int[] leftRes = helper(root.left), rightRes = helper(root.right);
        if (leftRes == null && rightRes == null) {
            return new int[] {root.val, root.val, Integer.MIN_VALUE};
        } else if (leftRes != null && rightRes != null) {
            int min = Math.min(leftRes[0], Math.min(rightRes[0], root.val)), max = Math.max(leftRes[1], Math.max(rightRes[1], root.val));
            int res = Math.max(Math.abs(root.val - min), Math.abs(root.val - max));
            
            return new int[] {min, max, Math.max(res, Math.max(leftRes[2], rightRes[2]))};
        } else if (leftRes == null) {
            
            int min = Math.min(rightRes[0], root.val);
            int max = Math.max(rightRes[1], root.val);
            int res = Math.max(Math.abs(root.val - min), Math.abs(root.val - max));
            return new int[] {min, max, Math.max(res, rightRes[2])};

        } else {
            
            int min = Math.min(leftRes[0], root.val);
            int max = Math.max(leftRes[1], root.val);
            int res = Math.max(Math.abs(root.val - min), Math.abs(root.val - max));
            return new int[] {min, max, Math.max(res, leftRes[2])}; 
        }
    }
}
