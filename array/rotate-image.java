class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        // int top=0;
        // int bot=n-1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }}
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][n-j-1];
                    matrix[i][n-j-1]=temp;
               
            }
        }
      
    }
}