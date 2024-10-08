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
    public static void fun(TreeNode root,ArrayList<Integer> arr){
        if(root==null)
            return ;
    
    arr.add(root.val);
    
        fun(root.left,arr);
   
        fun(root.right,arr);}
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        fun(root,arr);
        Collections.sort(arr);
       
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            if(arr.get(i)+arr.get(j)==k){
                return true;
            }
            if(arr.get(i)+arr.get(j)>k){
                j--;
            }else{
                i++;
            }
            
        }
        
        
        return false;
    }
}