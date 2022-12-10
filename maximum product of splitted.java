class Solution {
    //stores subtree sum
    Map<TreeNode,Long> map=new HashMap<>();
    long maxValue=Integer.MIN_VALUE;
    long total=0;
    public int maxProduct(TreeNode root) {
        //calculates sum at each tree node
        total = calculateSum(root);
        // traverse each node to calcuate maxValue
        traverse(root);
        return (int)(maxValue%1000000007);
    }
    
    private long calculateSum(TreeNode node){
        long sum=node.val;
        if(node.left!=null) sum+= calculateSum(node.left);
        if(node.right!=null) sum+= calculateSum(node.right);
        map.put(node,sum);
        return sum;
    }
    private void traverse(TreeNode node){
        if(node==null) return;
        long subTreeSum = map.get(node);
        //using hint if we know the sum of a subtree,
        //the answer is max( (total_sum - subtree_sum) * subtree_sum) in each node.
        maxValue=Math.max(maxValue,(total - subTreeSum) * subTreeSum);
        traverse(node.left);
        traverse(node.right);
    }
}
