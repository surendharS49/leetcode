class Solution {
    public int findLUSlength(String a, String b) {
        int n=a.length();
        int m=b.length();
        if(a.equals(b)){
            return -1;
        }
        else{
            if(n>m){
                return n;
            }
            return m;
        }}
        
    //     int dp[][]=new int[n+1][m+1];
    //     for(int i=0;i<n+1;i++){
    //         for(int j=0;j<m+1;j++){
    //             dp[i][j]=-1;
    //         }
    //     }
    //     return fun(dp,a,b,n,m);
        
    // }
    // public int fun(int dp[][],String a,String b,int n,int m){
    //     if(n==0 || m==0){
    //         return 0;
    //     }
    //     if(dp[n][m]!=-1){
    //         return dp[n][m];
    //     }
    //     if(a.charAt(n-1)!=b.charAt(m-1)){
    //         dp[n][m]=1+fun(dp,a,b,n-1,m-1);
    //     }else{
    //         dp[n][m]=Math.max(fun(dp,a,b,n-1,m),fun(dp,a,b,n,m-1));
    //         return dp[n][m];
    //     }
    //     return dp[n][m];
    // }
}