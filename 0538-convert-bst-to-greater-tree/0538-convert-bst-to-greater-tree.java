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
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }

        // 1. Visit larger nodes first (Right Subtree)
        convertBST(root.right);

        // 2. Update running total sum and node's value
        sum += root.val;
        root.val = sum;

        // 3. Visit smaller nodes later (Left Subtree)
        convertBST(root.left);

        return root;
    }
}