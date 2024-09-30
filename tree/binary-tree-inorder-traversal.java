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
    static void data(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return ;
        }
        data(root.left,arr);
        arr.add(root.val);
        data(root.right,arr);
    }
    public List<Integer>inorderTraversal(TreeNode root) {
        
        ArrayList<Integer>arr=new ArrayList<>();
        data(root, arr);
        return arr;
        
    }
}