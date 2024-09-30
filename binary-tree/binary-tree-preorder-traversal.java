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
        
        ar.add(root.val);
        data(root.left,ar);
        data(root.right,ar);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>ar=new ArrayList<>();
    
        data(root,ar);
        return ar;
    }
}