class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root);
        while (!queue.isEmpty()) {
            int sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null){
                     queue.add(node.left);}
                if (node.right != null) {
                    queue.add(node.right);}
            }
            if (queue.isEmpty()){
                 return sum;
            } 
        }
        return 0; 
    }
}