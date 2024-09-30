class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> arr = new ArrayList<>();
        fun(root1, arr);
        fun(root2, arr);
        Collections.sort(arr);
        return arr;
    }
    
    private void fun(TreeNode root, List<Integer> arr) {
        if (root == null) return;
        fun(root.left, arr);
        arr.add(root.val);
        fun(root.right, arr);
    }
}