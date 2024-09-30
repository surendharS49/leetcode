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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        fun(hm,root);
        ArrayList<Integer>arr=new ArrayList<>();
        int max=0;
        for(int t:hm.keySet()){
            if(hm.get(t)>max){
                max=hm.get(t);
                
            }
        }
        for(int t:hm.keySet()){
            if(hm.get(t)==max){
                arr.add(t);
                
            }
        }
        
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
        
    }
    public static void fun(HashMap<Integer,Integer>hm,TreeNode root){
        if(root==null){
            return;
        }
        if(hm.containsKey(root.val)){
            hm.put(root.val,hm.get(root.val)+1);
        }else{
            hm.put(root.val,1);
        }
        fun(hm,root.left);
        fun(hm,root.right);
    }
}