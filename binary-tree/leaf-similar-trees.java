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
    public static void bfs(TreeNode root,ArrayList<Integer> arr){

        if( root.left== null && root.right==null){
            arr.add(root.val);
        }
        if(root.left!=null)
            bfs(root.left,arr);
        if(root.right!=null)
             bfs(root.right,arr);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

       ArrayList<Integer>arr1=new ArrayList<>();
       ArrayList<Integer>arr2=new ArrayList<>();
    
       bfs(root1,arr1);
       bfs(root2,arr2);
       if(arr1.size()!=arr2.size()){
        return false;
       }
       return Arrays.equals(arr1.toArray(),arr2.toArray());
        

       
    }
}