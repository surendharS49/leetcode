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
    static int ans=0;
    public static int sum(TreeNode root){
        
        if(root==null){
        return 0;
            }
            //ans=ans+root.val;
                return sum(root.left)+sum(root.right)+root.val;
            }

    public boolean checkTree(TreeNode root) {
        
        int s=sum(root);
        if(s-root.val==root.val){
            return true;
        }
        return false;
        
    }
}