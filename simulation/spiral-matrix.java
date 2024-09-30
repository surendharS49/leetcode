class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer>arr=new ArrayList<>();
        int top=0;
        int bottom=mat.length-1;
        int right=mat[0].length-1;
        int left=0;
        while(top<=bottom && right>=left){
            for(int i=left;i<=right;i++){
                arr.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                arr.add(mat[bottom][i]);
            }
            bottom--;}
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                arr.add(mat[i][left]);
            }
            left++;}
        }
        return arr;
    }
}