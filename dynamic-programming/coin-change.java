class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n=coins.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=coins[i];
        }
        int sum=amount;
        int dp[][]=new int[n+1][sum+1];
         for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                dp[i][j]=-1;
            }  
        }
        int ans=coin(arr,n,sum,dp);
        if(ans>=100000){
            return -1;
        }else{
            return ans;
        }


    }
    int coin(int arr[],int n,int sum,int[][] dp){
        if(sum==0){
            return 0;
        }if(n==0){
            return 100000;
        }
        int take=100000;
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }
        if(arr[n-1]<=sum){
             take=coin(arr,n,sum-arr[n-1],dp);

        }
        
            int nt=coin(arr,n-1,sum,dp);
            dp[n][sum]=Math.min(take+1,nt);
           
        return dp[n][sum];
    }
}