class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int j=1;j<=n;j++){
            if(n%j==0){
                sum=sum+nums[j-1]*nums[j-1];
            }
        }
        return sum;
    }
}