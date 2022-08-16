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
        int count =0;
        int out=0;
    public int kthSmallest(TreeNode root, int k) {
        // Inorder traversal in BST all on left is small and all on right is largest
        
        recurring(root,k);
        return out;
        
    }
    
    public void recurring(TreeNode root,int k){
        if(root.left!=null){
            recurring(root.left,k);
            
        }
        count++;
        if(count == k){
            out=root.val;
            return;
            
        }
        if(root.right!=null){
            recurring(root.right,k);
        }
    }
}