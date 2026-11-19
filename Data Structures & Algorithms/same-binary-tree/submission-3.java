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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1= new ArrayDeque<>();
        Queue<TreeNode> q2= new ArrayDeque<>();
        
        if(p!=null) q1.offer(p);
        if(q!=null) q2.offer(q);
        if(q1.size()!=q2.size()) return false;

        while(!q1.isEmpty()){
            TreeNode n1 = q1.poll();
            TreeNode n2 = q2.poll();
            if(n1.val!=n2.val) return false;

            if (n1.left != null) q1.offer(n1.left);
            if (n2.left != null) q2.offer(n2.left);
            if(q1.size()!=q2.size()) return false;

            if (n1.right != null) q1.offer(n1.right);
            if (n2.right != null) q2.offer(n2.right);
            if(q1.size()!=q2.size()) return false;

        }
        return true;
    }
}
