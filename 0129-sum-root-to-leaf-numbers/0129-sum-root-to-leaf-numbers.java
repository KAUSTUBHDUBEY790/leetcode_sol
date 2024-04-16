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

    public class QueueNode {
        TreeNode node;
        int value;

        public QueueNode(TreeNode node, int value) {
            this.node = node;
            this.value = value;
        }
    }


    private int getValue(int existingNumber, int newNumber) {
        return existingNumber * 10 + newNumber;
    }
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        Queue<QueueNode> qu = new LinkedList<>();
        qu.add(new QueueNode(root, getValue(0, root.val)));
        while (!qu.isEmpty()) {
            QueueNode poll = qu.poll();
            TreeNode node = poll.node;
            if(node.left == null && node.right== null){
                sum+= poll.value;
            }
            if(node.left != null){
                qu.add(new QueueNode(node.left, getValue(poll.value, node.left.val)));
            }
            if(node.right != null){
                qu.add(new QueueNode(node.right, getValue(poll.value, node.right.val)));
            }
        }
        return sum;
    }
}