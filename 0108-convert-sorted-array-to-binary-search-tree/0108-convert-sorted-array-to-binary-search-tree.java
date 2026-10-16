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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int[] nums, int start, int end) {
        // Base case: empty subarray
        if (start > end) {
            return null;
        }

        // Find the middle element to ensure height balance
        int mid = start + (end - start) / 2;

        // Create the root node for the current subtree
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively construct left and right subtrees
        root.left = createTree(nums, start, mid - 1);
        root.right = createTree(nums, mid + 1, end);

        return root;
    }
}