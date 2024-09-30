class Solution {
    public int longestPalindromeSubseq(String s) {




        String ch1="";
        for(int i=s.length()-1;i>=0;i--){
            ch1=ch1+s.charAt(i);}
            int m=s.length();
            int n=ch1.length();
            int dp[][]=new int[m+1][n+1];
            for(int x=0;x<m+1;x++){
                for(int j=0;j<n+1;j++){
                    dp[x][j]=-1;
                }
            }

        int ans=lcs(s,ch1,s.length(),ch1.length(), dp);
        return ans;
        
    }
    int lcs(String ch1,String ch2,int m,int n,int dp[][]){
        if(m==0||n==0){
            return 0;

        }if(dp[m][n]!=-1){
            return dp[m][n];
        }

        if(ch1.charAt(m-1)==ch2.charAt(n-1)){
            int ans=1+lcs(ch1,ch2,m-1,n-1,dp);
            return ans;
           // return dp[m][n];
        }
        else{
            int ans1=lcs(ch1,ch2,m-1,n,dp);
            int ans2=lcs(ch1,ch2,m,n-1,dp);
            dp[m][n]= Math.max(ans1,ans2);
            return dp[m][n];
        }
    }
}
        
