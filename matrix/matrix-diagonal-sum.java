class Solution {
    public int diagonalSum(int[][] mat) {
        int a=mat.length;
        int b=mat[0].length;
        int ans=0;
        if(a%2==0){
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                   
                        if(j==i || j==b-i-1){
                            ans=mat[i][j]+ans;
                        }
                    
                }
            }
        }else{
             for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                        if(j==i||j==b-i-1){
                            ans=mat[i][j]+ans;
                        }
                    
                }
            }
        }

        return ans;
    }
}