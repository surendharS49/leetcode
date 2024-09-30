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
     private int ans = Integer.MAX_VALUE;
    private Integer prev = null;
    public int getMinimumDifference(TreeNode root) {
        
        fun(root);
        return ans;
    }
    //static Integer prev=null;
    public  void fun(TreeNode root){
         
        if(root==null ){
            return;
        }
        
        fun(root.left);
        if(prev!=null){
            ans=Math.min(Math.abs(root.val-prev),ans);}
        prev=root.val;
        fun(root.right);
    }
}