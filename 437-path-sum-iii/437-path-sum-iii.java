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
    public int pathSum(TreeNode root, int targetSum) {
//         if (root == null){
//             return 0;
//         }
        
        
//         return dfs(root,targetSum) + 
//             pathSum(root.left, targetSum) + 
//             pathSum(root.right, targetSum);
        
//     }
    
//     private int dfs(TreeNode root,int targetSum){
//         if(root==null){
//             return 0;
//         }
        
//         return (targetSum==root.val ? 1:0) + 
//             dfs(root.left, targetSum-root.val) + 
//             dfs(root.right , targetSum-root.val);
//     }
    
        
        if(root==null)
            return 0;
        
        return findPath(root,targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }
    
    public int findPath(TreeNode root, long sum) {
        
        int res=0;
        
        if(root==null)
            return 0;
        
        if(root.val==sum)
            res++;
        
        res = res + findPath(root.left,sum-root.val);
        res= res + findPath(root.right,sum-root.val);
        
        return res;
    }
    
    
}