class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {

        // Empty tree is balanced
        if (node == null) {
            return 0;
        }

        // Check left subtree
        int leftHeight = height(node.left);

        if (leftHeight == -1) {
            return -1;
        }

        // Check right subtree
        int rightHeight = height(node.right);

        if (rightHeight == -1) {
            return -1;
        }

        // Check current node
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Return height of current subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }
}