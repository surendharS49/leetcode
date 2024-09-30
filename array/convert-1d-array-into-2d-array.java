class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {

        int[][] ans=new int[m][n];
    int l=original.length;
    if(l!=m*n){
        return new int[0][0];
    }
  int i=0;
    for(int x=0;x<m;x++){
        for(int y=0;y<n;y++){
        ans[x][y]=original[i++];
       }
    }   return ans; 
    }
}