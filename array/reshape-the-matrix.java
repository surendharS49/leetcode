class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         int m = mat.length;
        int n = mat[0].length;
        if((m*n)!=(r*c)){
            return mat;
        }
        int ans[][]=new int[r][c];
        int k=0;int l=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             ans[k][l]=mat[i][j]; 
             l++;
              if(l==c){
                l=0;
                k++;
              }     
            }
        }return ans;
    }
}