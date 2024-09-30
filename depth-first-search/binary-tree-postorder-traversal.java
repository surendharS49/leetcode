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
     public static void data(TreeNode root,ArrayList ar){
        
        if(root==null){
            return ;
        }
        
        
        data(root.left,ar);
        data(root.right,ar);
        ar.add(root.val);

    }
    
        
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer>ar=new ArrayList<>();
    
        data(root,ar);
        return ar;
        
    }
}