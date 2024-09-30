class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = coins[i];
        }
        int sum = amount;
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = coin(arr, n, sum, dp);

        return ans;

    }

    int coin(int arr[], int n, int sum, int[][] dp) {
        if (sum == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        if (dp[n][sum] != -1) {
            return dp[n][sum];
        }
        if (arr[n - 1] > sum) {
            dp[n][sum] = coin(arr, n - 1, sum, dp);
            return dp[n][sum];

        } else {
            int p = coin(arr, n, sum - arr[n - 1], dp);
            int nt = coin(arr, n - 1, sum, dp);
            dp[n][sum] = p + nt;

            return dp[n][sum];
        }
    }
}
