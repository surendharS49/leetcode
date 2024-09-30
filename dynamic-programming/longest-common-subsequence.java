class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        return fun(m,n,text1,text2,dp);

    }
    public static int fun(int m,int n,String str1,String str2,int dp[][]){
        if(m==0 || n==0){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            dp[m][n]=1+fun(m-1,n-1,str1,str2,dp);
            return dp[m][n];
        }else{
            dp[m][n]=Math.max(fun(m-1,n,str1,str2,dp),fun(m,n-1,str1,str2,dp));
            return dp[m][n];
        }
    }
}